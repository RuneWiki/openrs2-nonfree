import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!dc", name = "Bb", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!dc", name = "Cb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!dc", name = "Jb", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
	private int anInt428 = -1;

	@OriginalMember(owner = "client!dc", name = "qb", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!dc", name = "Hb", descriptor = "Z")
	private volatile boolean aBoolean30 = false;

	@OriginalMember(owner = "client!dc", name = "wb", descriptor = "Lclient!qb;")
	private final Class58 aClass58_2;

	@OriginalMember(owner = "client!dc", name = "Lb", descriptor = "Lclient!qb;")
	private final Class58 aClass58_3;

	@OriginalMember(owner = "client!dc", name = "Fb", descriptor = "I")
	private final int anInt442;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!qb;Lclient!qb;IZZZ)V")
	public Class17_Sub1(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean29 = arg5;
		this.aClass58_2 = arg0;
		this.aClass58_3 = arg1;
		this.anInt442 = arg2;
		Static45.method810(this, this.anInt442);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZI[BLclient!qb;)V")
	public void method304(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class58 arg3) {
		@Pc(71) int local71;
		if (arg3 != this.aClass58_3) {
			if (!arg0 && this.anInt428 == arg1) {
				this.aBoolean30 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray3[arg1] = false;
				if (this.aBoolean29 || arg0) {
					Static56.method981(arg1, super.anIntArray58[arg1], this, arg0, (byte) 2, this.anInt442);
				}
			} else {
				Static72.aCRC32_2.reset();
				Static72.aCRC32_2.update(arg2, 0, arg2.length - 2);
				local71 = (int) Static72.aCRC32_2.getValue();
				@Pc(91) int local91 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
				if (local71 == super.anIntArray58[arg1] && super.anIntArray60[arg1] == local91) {
					this.aBooleanArray3[arg1] = true;
					if (arg0) {
						super.anObjectArray2[arg1] = Static133.method2015(arg2);
					}
				} else {
					this.aBooleanArray3[arg1] = false;
					if (this.aBoolean29 || arg0) {
						Static56.method981(arg1, super.anIntArray58[arg1], this, arg0, (byte) 2, this.anInt442);
					}
				}
			}
		} else if (this.aBoolean30) {
			throw new RuntimeException();
		} else if (arg2 == null) {
			Static56.method981(this.anInt442, this.anInt441, this, true, (byte) 0, 255);
		} else {
			Static72.aCRC32_2.reset();
			Static72.aCRC32_2.update(arg2, 0, arg2.length);
			local71 = (int) Static72.aCRC32_2.getValue();
			@Pc(181) Class4_Sub10 local181 = new Class4_Sub10(Static118.method1795(arg2));
			@Pc(185) int local185 = local181.method599();
			if (local185 != 5 && local185 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local185);
			}
			@Pc(208) int local208 = 0;
			if (local185 >= 6) {
				local208 = local181.method549();
			}
			if (this.anInt441 == local71 && local208 == this.anInt444) {
				this.method280(arg2);
				this.method314();
			} else {
				Static56.method981(this.anInt442, this.anInt441, this, true, (byte) 0, 255);
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(III)V")
	public void method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt444 = arg0;
		this.anInt441 = arg1;
		if (this.aClass58_3 == null) {
			Static56.method981(this.anInt442, this.anInt441, this, true, (byte) 0, 255);
		} else {
			Static133.method2013(this, this.anInt442, this.aClass58_3);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	@Override
	protected void method278(@OriginalArg(0) int arg0) {
		if (this.aClass58_2 == null || this.aBooleanArray3 == null || !this.aBooleanArray3[arg0]) {
			Static56.method981(arg0, super.anIntArray58[arg0], this, true, (byte) 2, this.anInt442);
		} else {
			Static133.method2013(this, arg0, this.aClass58_2);
		}
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(II)I")
	private int method308(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray3[arg0] ? 100 : Static91.method1482(this.anInt442, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	public int method309() {
		if (this.aBoolean30) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static91.method1482(255, this.anInt442);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(II)V")
	@Override
	protected void method296(@OriginalArg(0) int arg0) {
		Static130.method1947(arg0, this.anInt442);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)I")
	public int method312() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(16) int local16 = 0; local16 < super.anObjectArray2.length; local16++) {
			if (super.anIntArray57[local16] > 0) {
				local7 += 100;
				local9 += this.method308(local16);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
	private void method314() {
		this.aBooleanArray3 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray3.length; local13++) {
			this.aBooleanArray3[local13] = false;
		}
		if (this.aClass58_2 == null) {
			this.aBoolean30 = true;
			return;
		}
		this.anInt428 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray3.length; local42++) {
			if (super.anIntArray57[local42] > 0) {
				Static57.method1005(this.aClass58_2, local42, this);
				this.anInt428 = local42;
			}
		}
		if (this.anInt428 == -1) {
			this.aBoolean30 = true;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BZZIZ)V")
	public void method315(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg1) {
			if (this.aBoolean30) {
				throw new RuntimeException();
			}
			if (this.aClass58_3 != null) {
				Static110.method1681(this.anInt442, this.aClass58_3, arg0);
			}
			this.method280(arg0);
			this.method314();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray60[arg2] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray60[arg2];
		if (this.aClass58_2 != null) {
			Static110.method1681(arg2, this.aClass58_2, arg0);
			this.aBooleanArray3[arg2] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg2] = Static133.method2015(arg0);
			return;
		}
	}
}
