import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class146 {

	@OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
	public static final int[] anIntArray227 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
	public static final int[] anIntArray226 = new int[32];

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!wc;")
	public static final Class246 aClass246_4 = new Class246();

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!ii;")
	public Class104 aClass104_1;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public int anInt3748;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!bt;)V", line = 4)
	public void method3707(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4816();
			if (local13 == 0) {
				return;
			}
			this.method3710(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z", line = 41)
	public boolean method3709() {
		return this.aClass104_1.aClass197_39.method5088(this.anInt3747);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!bt;I)V", line = 64)
	private void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt3747 = arg1.method4830();
		} else if (arg0 == 2) {
			this.anInt3748 = arg1.method4834();
		} else if (arg0 == 3) {
			this.aBoolean243 = true;
		} else if (arg0 == 4) {
			this.anInt3747 = -1;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZILclient!wm;)Lclient!jd;", line = 129)
	public Class13 method3712(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(24) long local24 = (long) (this.anInt3747 | arg1 << 16 | (arg0 ? 262144 : 0) | arg2.anInt2833 << 19);
		@Pc(32) Class13 local32 = (Class13) this.aClass104_1.aClass98_20.method2614(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass104_1.aClass197_39.method5088(this.anInt3747)) {
			@Pc(54) Class48 local54 = Static372.method1684(this.aClass104_1.aClass197_39, this.anInt3747, 0);
			if (local54 != null) {
				local54.anInt1532 = local54.anInt1533 = local54.anInt1530 = local54.anInt1528 = 0;
				if (arg0) {
					local54.method1689();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method1677();
				}
			}
			local32 = arg2.method2893(local54);
			if (local32 != null) {
				this.aClass104_1.aClass98_20.method2626(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}
}
