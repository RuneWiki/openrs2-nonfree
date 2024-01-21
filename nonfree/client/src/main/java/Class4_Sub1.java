import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "I")
	private int anInt3194;

	@OriginalMember(owner = "client!o", name = "Fb", descriptor = "I")
	private int anInt3200;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!o", name = "Gb", descriptor = "Z")
	private volatile boolean aBoolean239 = false;

	@OriginalMember(owner = "client!o", name = "Lb", descriptor = "I")
	private int anInt3205 = -1;

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "Lclient!hb;")
	private final Class28 aClass28_2;

	@OriginalMember(owner = "client!o", name = "Jb", descriptor = "I")
	private final int anInt3203;

	@OriginalMember(owner = "client!o", name = "lb", descriptor = "Lclient!hb;")
	private final Class28 aClass28_1;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!hb;Lclient!hb;IZZZ)V")
	public Class4_Sub1(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass28_2 = arg0;
		this.aBoolean238 = arg5;
		this.anInt3203 = arg2;
		this.aClass28_1 = arg1;
		Static4.method82(this, this.anInt3203);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBIZ[B)V")
	public void method2270(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2) {
			if (this.aBoolean239) {
				throw new RuntimeException();
			}
			if (this.aClass28_1 != null) {
				Static106.method2064(this.anInt3203, this.aClass28_1, arg3);
			}
			this.method2268(arg3);
			this.method2276();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray305[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray305[arg1];
		if (this.aClass28_2 != null) {
			Static106.method2064(arg1, this.aClass28_2, arg3);
			this.aBooleanArray39[arg1] = true;
		}
		if (arg0) {
			super.anObjectArray28[arg1] = Static43.method1147(arg3);
		}
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)I")
	public int method2271() {
		if (this.aBoolean239) {
			return 100;
		} else if (super.anObjectArray28 == null) {
			@Pc(19) int local19 = Static44.method1166(this.anInt3203, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(IB)V")
	@Override
	protected void method2263(@OriginalArg(0) int arg0) {
		if (this.method2246(arg0)) {
			Static33.method953(arg0, this.anInt3203);
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)V")
	@Override
	protected void method2250(@OriginalArg(1) int arg0) {
		if (!this.method2246(arg0)) {
			return;
		}
		if (this.aClass28_2 == null || this.aBooleanArray39 == null || !this.aBooleanArray39[arg0]) {
			Static51.method1267(arg0, (byte) 2, super.anIntArray302[arg0], this.anInt3203, true, this);
		} else {
			Static155.method3044(this, arg0, this.aClass28_2);
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(II)I")
	@Override
	protected int method2257(@OriginalArg(1) int arg0) {
		if (!this.method2246(arg0)) {
			return 0;
		} else if (super.anObjectArray28[arg0] == null) {
			return this.aBooleanArray39[arg0] ? 100 : Static44.method1166(arg0, this.anInt3203);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!hb;ZI[B)V")
	public void method2272(@OriginalArg(1) Class28 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(45) int local45;
		if (arg0 != this.aClass28_1) {
			if (!arg1 && this.anInt3205 == arg2) {
				this.aBoolean239 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray39[arg2] = false;
				if (this.aBoolean238 || arg1) {
					Static51.method1267(arg2, (byte) 2, super.anIntArray302[arg2], this.anInt3203, arg1, this);
				}
			} else {
				Static148.aCRC32_2.reset();
				Static148.aCRC32_2.update(arg3, 0, arg3.length - 2);
				local45 = (int) Static148.aCRC32_2.getValue();
				@Pc(213) int local213 = (arg3[arg3.length - 1] & 0xFF) + ((arg3[arg3.length - 2] & 0xFF) << 8);
				if (super.anIntArray302[arg2] == local45 && super.anIntArray305[arg2] == local213) {
					this.aBooleanArray39[arg2] = true;
					if (arg1) {
						super.anObjectArray28[arg2] = Static43.method1147(arg3);
					}
				} else {
					this.aBooleanArray39[arg2] = false;
					if (this.aBoolean238 || arg1) {
						Static51.method1267(arg2, (byte) 2, super.anIntArray302[arg2], this.anInt3203, arg1, this);
					}
				}
			}
		} else if (this.aBoolean239) {
			throw new RuntimeException();
		} else if (arg3 == null) {
			Static51.method1267(this.anInt3203, (byte) 0, this.anInt3200, 255, true, this);
		} else {
			Static148.aCRC32_2.reset();
			Static148.aCRC32_2.update(arg3, 0, arg3.length);
			local45 = (int) Static148.aCRC32_2.getValue();
			if (local45 == this.anInt3200) {
				@Pc(71) Class1_Sub8 local71;
				try {
					local71 = new Class1_Sub8(Static109.method2133(arg3));
				} catch (@Pc(73) RuntimeException local73) {
					Static51.method1267(this.anInt3203, (byte) 0, this.anInt3200, 255, true, this);
					return;
				}
				@Pc(88) int local88 = local71.method1607();
				if (local88 == 5 || local88 == 6) {
					@Pc(109) int local109 = 0;
					if (local88 >= 6) {
						local109 = local71.method1626();
					}
					if (this.anInt3194 == local109) {
						this.method2268(arg3);
						this.method2276();
					} else {
						Static51.method1267(this.anInt3203, (byte) 0, this.anInt3200, 255, true, this);
					}
				} else {
					Static51.method1267(this.anInt3203, (byte) 0, this.anInt3200, 255, true, this);
				}
			} else {
				Static51.method1267(this.anInt3203, (byte) 0, this.anInt3200, 255, true, this);
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)V")
	public void method2274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3194 = arg1;
		this.anInt3200 = arg0;
		if (this.aClass28_1 == null) {
			Static51.method1267(this.anInt3203, (byte) 0, this.anInt3200, 255, true, this);
		} else {
			Static155.method3044(this, this.anInt3203, this.aClass28_1);
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	private void method2276() {
		this.aBooleanArray39 = new boolean[super.anObjectArray28.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray39.length; local9++) {
			this.aBooleanArray39[local9] = false;
		}
		if (this.aClass28_2 == null) {
			this.aBoolean239 = true;
			return;
		}
		this.anInt3205 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray39.length; local43++) {
			if (super.anIntArray306[local43] > 0) {
				Static66.method1448(local43, this, this.aClass28_2);
				this.anInt3205 = local43;
			}
		}
		if (this.anInt3205 == -1) {
			this.aBoolean239 = true;
		}
	}
}
