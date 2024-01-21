import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!a", name = "gb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!a", name = "W", descriptor = "I")
	private int anInt67 = -1;

	@OriginalMember(owner = "client!a", name = "jb", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!a", name = "ob", descriptor = "Z")
	private volatile boolean aBoolean6 = false;

	@OriginalMember(owner = "client!a", name = "qb", descriptor = "Lclient!lb;")
	private final Class53 aClass53_2;

	@OriginalMember(owner = "client!a", name = "ab", descriptor = "Lclient!lb;")
	private final Class53 aClass53_1;

	@OriginalMember(owner = "client!a", name = "kb", descriptor = "I")
	private final int anInt74;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;IZZZ)V")
	public Class1_Sub1(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass53_2 = arg1;
		this.aBoolean5 = arg5;
		this.aClass53_1 = arg0;
		this.anInt74 = arg2;
		Static130.method1949(this.anInt74, this);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI[BZI)V")
	public void method66(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		if (arg0) {
			if (this.aBoolean6) {
				throw new RuntimeException();
			}
			if (this.aClass53_2 != null) {
				Static193.method3104(this.anInt74, this.aClass53_2, arg2);
			}
			this.method49(arg2);
			this.method70();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray12[arg1] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray12[arg1];
		if (this.aClass53_1 != null) {
			Static193.method3104(arg1, this.aClass53_1, arg2);
			this.aBooleanArray1[arg1] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg1] = Static77.method1277(arg2);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BLclient!lb;ZI)V")
	public void method67(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(61) int local61;
		if (this.aClass53_2 != arg2) {
			if (!arg3 && this.anInt67 == arg0) {
				this.aBoolean6 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray1[arg0] = false;
				if (this.aBoolean5 || arg3) {
					Static32.method3058(arg3, this, super.anIntArray8[arg0], this.anInt74, (byte) 2, arg0);
				}
				return;
			}
			Static182.aCRC32_2.reset();
			Static182.aCRC32_2.update(arg1, 0, arg1.length - 2);
			local61 = (int) Static182.aCRC32_2.getValue();
			@Pc(81) int local81 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
			if (super.anIntArray8[arg0] != local61 || local81 != super.anIntArray12[arg0]) {
				this.aBooleanArray1[arg0] = false;
				if (this.aBoolean5 || arg3) {
					Static32.method3058(arg3, this, super.anIntArray8[arg0], this.anInt74, (byte) 2, arg0);
				}
				return;
			}
			this.aBooleanArray1[arg0] = true;
			if (arg3) {
				super.anObjectArray2[arg0] = Static77.method1277(arg1);
			}
			return;
		}
		if (this.aBoolean6) {
			throw new RuntimeException();
		}
		if (arg1 == null) {
			Static32.method3058(true, this, this.anInt69, 255, (byte) 0, this.anInt74);
			return;
		}
		Static182.aCRC32_2.reset();
		Static182.aCRC32_2.update(arg1, 0, arg1.length);
		local61 = (int) Static182.aCRC32_2.getValue();
		if (local61 != this.anInt69) {
			Static32.method3058(true, this, this.anInt69, 255, (byte) 0, this.anInt74);
			return;
		}
		@Pc(191) Class3_Sub17 local191;
		try {
			local191 = new Class3_Sub17(Static19.method319(arg1));
		} catch (@Pc(193) RuntimeException local193) {
			Static32.method3058(true, this, this.anInt69, 255, (byte) 0, this.anInt74);
			return;
		}
		@Pc(208) int local208 = local191.method2107();
		if (local208 != 5 && local208 != 6) {
			Static32.method3058(true, this, this.anInt69, 255, (byte) 0, this.anInt74);
			return;
		}
		@Pc(229) int local229 = 0;
		if (local208 >= 6) {
			local229 = local191.method2132();
		}
		if (this.anInt68 != local229) {
			Static32.method3058(true, this, this.anInt69, 255, (byte) 0, this.anInt74);
			return;
		}
		this.method49(arg1);
		this.method70();
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IIB)V")
	public void method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt68 = arg1;
		this.anInt69 = arg0;
		if (this.aClass53_2 == null) {
			Static32.method3058(true, this, this.anInt69, 255, (byte) 0, this.anInt74);
		} else {
			Static145.method2320(this.anInt74, this, this.aClass53_2);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)I")
	@Override
	protected int method46(@OriginalArg(1) int arg0) {
		if (!this.method37(arg0)) {
			return 0;
		} else if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray1[arg0] ? 100 : Static52.method777(arg0, this.anInt74);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	@Override
	protected void method34(@OriginalArg(1) int arg0) {
		if (!this.method37(arg0)) {
			return;
		}
		if (this.aClass53_1 == null || this.aBooleanArray1 == null || !this.aBooleanArray1[arg0]) {
			Static32.method3058(true, this, super.anIntArray8[arg0], this.anInt74, (byte) 2, arg0);
		} else {
			Static145.method2320(arg0, this, this.aClass53_1);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	public int method69() {
		if (this.aBoolean6) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static52.method777(this.anInt74, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	@Override
	protected void method32(@OriginalArg(0) int arg0) {
		if (this.method37(arg0)) {
			Static82.method1216(this.anInt74, arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	private void method70() {
		this.aBooleanArray1 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray1.length; local13++) {
			this.aBooleanArray1[local13] = false;
		}
		if (this.aClass53_1 == null) {
			this.aBoolean6 = true;
			return;
		}
		this.anInt67 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray1.length; local42++) {
			if (super.anIntArray7[local42] > 0) {
				Static159.method2539(local42, this, this.aClass53_1);
				this.anInt67 = local42;
			}
		}
		if (this.anInt67 == -1) {
			this.aBoolean6 = true;
		}
	}
}
