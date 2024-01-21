import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ha", name = "qb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!ha", name = "tb", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!ha", name = "Lb", descriptor = "I")
	private int anInt1381;

	@OriginalMember(owner = "client!ha", name = "ob", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ha", name = "zb", descriptor = "I")
	private int anInt1373 = -1;

	@OriginalMember(owner = "client!ha", name = "Cb", descriptor = "Z")
	private volatile boolean aBoolean44 = false;

	@OriginalMember(owner = "client!ha", name = "Bb", descriptor = "Lclient!ca;")
	private final Class13 aClass13_2;

	@OriginalMember(owner = "client!ha", name = "Jb", descriptor = "Lclient!ca;")
	private final Class13 aClass13_3;

	@OriginalMember(owner = "client!ha", name = "vb", descriptor = "I")
	private final int anInt1371;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!ca;Lclient!ca;IZZZ)V")
	public Class25_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass13_2 = arg1;
		this.aBoolean43 = arg5;
		this.aClass13_3 = arg0;
		this.anInt1371 = arg2;
		Static13.method355(this.anInt1371, this);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)V")
	@Override
	protected void method912(@OriginalArg(0) int arg0) {
		Static126.method2278(this.anInt1371, arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ca;ZZ[BI)V")
	public void method934(@OriginalArg(0) Class13 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(39) int local39;
		if (arg0 == this.aClass13_2) {
			if (this.aBoolean44) {
				throw new RuntimeException();
			}
			if (arg2 == null) {
				Static67.method1379(this.anInt1371, true, this.anInt1381, (byte) 0, this, 255);
				return;
			}
			Static21.aCRC32_1.reset();
			Static21.aCRC32_1.update(arg2, 0, arg2.length);
			local39 = (int) Static21.aCRC32_1.getValue();
			if (this.anInt1381 != local39 || super.anInt1359 != this.anInt1369) {
				Static67.method1379(this.anInt1371, true, this.anInt1381, (byte) 0, this, 255);
				return;
			}
			this.method917(arg2);
			this.method936();
			return;
		}
		if (!arg1 && arg3 == this.anInt1373) {
			this.aBoolean44 = true;
		}
		if (arg2 == null || arg2.length <= 2) {
			this.aBooleanArray35[arg3] = false;
			if (this.aBoolean43 || arg1) {
				Static67.method1379(arg3, arg1, super.anIntArray156[arg3], (byte) 2, this, this.anInt1371);
			}
			return;
		}
		Static21.aCRC32_1.reset();
		Static21.aCRC32_1.update(arg2, 0, arg2.length - 2);
		local39 = (int) Static21.aCRC32_1.getValue();
		@Pc(144) int local144 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
		if (local39 != super.anIntArray156[arg3] || local144 != super.anIntArray154[arg3]) {
			this.aBooleanArray35[arg3] = false;
			if (this.aBoolean43 || arg1) {
				Static67.method1379(arg3, arg1, super.anIntArray156[arg3], (byte) 2, this, this.anInt1371);
			}
			return;
		}
		this.aBooleanArray35[arg3] = true;
		if (arg1) {
			super.anObjectArray2[arg3] = Static129.method2299(arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)I")
	public int method935() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(16) int local16 = 0; local16 < super.anObjectArray2.length; local16++) {
			if (super.anIntArray155[local16] > 0) {
				local9 += this.method937(local16);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
	private void method936() {
		this.aBooleanArray35 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray35.length; local13++) {
			this.aBooleanArray35[local13] = false;
		}
		if (this.aClass13_3 == null) {
			this.aBoolean44 = true;
			return;
		}
		this.anInt1373 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.aBooleanArray35.length; local49++) {
			if (super.anIntArray155[local49] > 0) {
				Static104.method2019(this, local49, this.aClass13_3);
				this.anInt1373 = local49;
			}
		}
		if (this.anInt1373 == -1) {
			this.aBoolean44 = true;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(BI)I")
	private int method937(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray35[arg0] ? 100 : Static52.method1128(this.anInt1371, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)I")
	public int method939() {
		if (this.aBoolean44) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static52.method1128(255, this.anInt1371);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IB)V")
	@Override
	protected void method915(@OriginalArg(0) int arg0) {
		if (this.aClass13_3 == null || this.aBooleanArray35 == null || !this.aBooleanArray35[arg0]) {
			Static67.method1379(arg0, true, super.anIntArray156[arg0], (byte) 2, this, this.anInt1371);
		} else {
			Static129.method2293(this.aClass13_3, arg0, this);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z[BZII)V")
	public void method943(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg0) {
			arg1[arg1.length - 2] = (byte) (super.anIntArray154[arg3] >> 8);
			arg1[arg1.length - 1] = (byte) super.anIntArray154[arg3];
			if (this.aClass13_3 != null) {
				Static122.method464(arg1, this.aClass13_3, arg3);
				this.aBooleanArray35[arg3] = true;
			}
			if (arg2) {
				super.anObjectArray2[arg3] = Static129.method2299(arg1);
			}
		} else if (this.aBoolean44) {
			throw new RuntimeException();
		} else {
			if (this.aClass13_2 != null) {
				Static122.method464(arg1, this.aClass13_2, this.anInt1371);
			}
			this.method917(arg1);
			this.method936();
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)V")
	public void method944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1369 = arg0;
		this.anInt1381 = arg1;
		if (this.aClass13_2 == null) {
			Static67.method1379(this.anInt1371, true, this.anInt1381, (byte) 0, this, 255);
		} else {
			Static129.method2293(this.aClass13_2, this.anInt1371, this);
		}
	}
}
