import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ca", name = "mb", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!ca", name = "xb", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!ca", name = "Lb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ca", name = "jb", descriptor = "I")
	private int anInt688 = -1;

	@OriginalMember(owner = "client!ca", name = "Gb", descriptor = "Z")
	private volatile boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ca", name = "ib", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "Lclient!qe;")
	private final Class69 aClass69_1;

	@OriginalMember(owner = "client!ca", name = "Kb", descriptor = "Lclient!qe;")
	private final Class69 aClass69_2;

	@OriginalMember(owner = "client!ca", name = "nb", descriptor = "I")
	private final int anInt690;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!qe;Lclient!qe;IZZZ)V")
	public Class13_Sub1(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass69_1 = arg0;
		this.aClass69_2 = arg1;
		this.aBoolean23 = arg5;
		this.anInt690 = arg2;
		Static80.method1895(this, this.anInt690);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[BZLclient!qe;)V")
	public void method541(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class69 arg3) {
		@Pc(69) int local69;
		if (arg3 != this.aClass69_2) {
			if (!arg2 && arg0 == this.anInt688) {
				this.aBoolean24 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray1[arg0] = false;
				if (this.aBoolean23 || arg2) {
					Static47.method2316(this, arg2, this.anInt690, (byte) 2, super.anIntArray59[arg0], arg0);
				}
				return;
			}
			Static132.aCRC32_1.reset();
			Static132.aCRC32_1.update(arg1, 0, arg1.length - 2);
			local69 = (int) Static132.aCRC32_1.getValue();
			@Pc(90) int local90 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
			if (super.anIntArray59[arg0] != local69 || local90 != super.anIntArray62[arg0]) {
				this.aBooleanArray1[arg0] = false;
				if (this.aBoolean23 || arg2) {
					Static47.method2316(this, arg2, this.anInt690, (byte) 2, super.anIntArray59[arg0], arg0);
				}
				return;
			}
			this.aBooleanArray1[arg0] = true;
			if (arg2) {
				super.anObjectArray2[arg0] = Static122.method2600(arg1);
				return;
			}
			return;
		}
		if (this.aBoolean24) {
			throw new RuntimeException();
		}
		if (arg1 == null) {
			Static47.method2316(this, true, 255, (byte) 0, this.anInt689, this.anInt690);
			return;
		}
		Static132.aCRC32_1.reset();
		Static132.aCRC32_1.update(arg1, 0, arg1.length);
		local69 = (int) Static132.aCRC32_1.getValue();
		if (local69 != this.anInt689) {
			Static47.method2316(this, true, 255, (byte) 0, this.anInt689, this.anInt690);
			return;
		}
		@Pc(207) Class2_Sub3 local207;
		try {
			local207 = new Class2_Sub3(Static97.method2263(arg1));
		} catch (@Pc(209) RuntimeException local209) {
			Static47.method2316(this, true, 255, (byte) 0, this.anInt689, this.anInt690);
			return;
		}
		@Pc(226) int local226 = local207.method218();
		if (local226 != 5 && local226 != 6) {
			Static47.method2316(this, true, 255, (byte) 0, this.anInt689, this.anInt690);
			return;
		}
		@Pc(249) int local249 = 0;
		if (local226 >= 6) {
			local249 = local207.method206();
		}
		if (local249 != this.anInt697) {
			Static47.method2316(this, true, 255, (byte) 0, this.anInt689, this.anInt690);
			return;
		}
		this.method523(arg1);
		this.method550();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method516(@OriginalArg(0) int arg0) {
		if (!this.method522(arg0)) {
			return;
		}
		if (this.aClass69_1 == null || this.aBooleanArray1 == null || !this.aBooleanArray1[arg0]) {
			Static47.method2316(this, true, this.anInt690, (byte) 2, super.anIntArray59[arg0], arg0);
		} else {
			Static40.method909(arg0, this, this.aClass69_1);
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(II)V")
	@Override
	protected void method536(@OriginalArg(1) int arg0) {
		if (this.method522(arg0)) {
			Static16.method403(arg0, this.anInt690);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)V")
	public void method543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt689 = arg0;
		this.anInt697 = arg1;
		if (this.aClass69_2 == null) {
			Static47.method2316(this, true, 255, (byte) 0, this.anInt689, this.anInt690);
		} else {
			Static40.method909(this.anInt690, this, this.aClass69_2);
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
	public int method544() {
		if (this.aBoolean24) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static192.method3525(255, this.anInt690);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z[BZIB)V")
	public void method548(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg0) {
			arg1[arg1.length - 2] = (byte) (super.anIntArray62[arg3] >> 8);
			arg1[arg1.length - 1] = (byte) super.anIntArray62[arg3];
			if (this.aClass69_1 != null) {
				Static130.method2739(arg3, this.aClass69_1, arg1);
				this.aBooleanArray1[arg3] = true;
			}
			if (arg2) {
				super.anObjectArray2[arg3] = Static122.method2600(arg1);
			}
		} else if (this.aBoolean24) {
			throw new RuntimeException();
		} else {
			if (this.aClass69_2 != null) {
				Static130.method2739(this.anInt690, this.aClass69_2, arg1);
			}
			this.method523(arg1);
			this.method550();
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	private void method550() {
		this.aBooleanArray1 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray1.length; local13++) {
			this.aBooleanArray1[local13] = false;
		}
		if (this.aClass69_1 == null) {
			this.aBoolean24 = true;
			return;
		}
		this.anInt688 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray1.length; local42++) {
			if (super.anIntArray63[local42] > 0) {
				Static156.method3011(this, local42, this.aClass69_1);
				this.anInt688 = local42;
			}
		}
		if (this.anInt688 == -1) {
			this.aBoolean24 = true;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I")
	@Override
	protected int method532(@OriginalArg(1) int arg0) {
		if (!this.method522(arg0)) {
			return 0;
		} else if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray1[arg0] ? 100 : Static192.method3525(this.anInt690, arg0);
		} else {
			return 100;
		}
	}
}
