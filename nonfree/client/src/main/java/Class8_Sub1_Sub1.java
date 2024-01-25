import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!gq", name = "Y", descriptor = "I")
	public final int anInt3085;

	@OriginalMember(owner = "client!gq", name = "bb", descriptor = "I")
	public final int anInt3088;

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "F")
	public final float aFloat24;

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "Z")
	public final boolean aBoolean185;

	@OriginalMember(owner = "client!gq", name = "O", descriptor = "F")
	public final float aFloat23;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ih;IIII[I)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3085 = arg1;
		this.anInt3088 = arg2;
		this.method2262(arg2, arg5, arg1);
		this.aFloat24 = (float) arg2 / (float) arg4;
		this.aBoolean185 = false;
		this.aFloat23 = (float) arg1 / (float) arg3;
		this.method2252(false, false);
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ih;IIIII[BI)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3088 = arg3;
		this.anInt3085 = arg2;
		this.method2258(arg2, true, arg6, arg3, arg7);
		this.aBoolean185 = false;
		this.aFloat23 = (float) arg2 / (float) arg4;
		this.aFloat24 = (float) arg3 / (float) arg5;
		this.method2252(false, false);
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ih;IIIIIZ)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3085 = arg4;
		if (super.anInt3947 == 34037) {
			this.aFloat24 = arg5;
			this.aFloat23 = arg4;
			this.aBoolean185 = false;
		} else {
			this.aBoolean185 = true;
			this.aFloat23 = this.aFloat24 = 1.0F;
		}
		this.anInt3088 = arg5;
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ih;IIIZ[I)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3088 = arg3;
		if (super.anInt3947 == 34037) {
			this.aFloat24 = arg3;
			this.aBoolean185 = false;
			this.aFloat23 = arg2;
		} else {
			this.aFloat23 = this.aFloat24 = 1.0F;
			this.aBoolean185 = true;
		}
		this.anInt3085 = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[BI)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3088 = arg4;
		if (super.anInt3947 == 34037) {
			this.aBoolean185 = false;
			this.aFloat24 = arg4;
			this.aFloat23 = arg3;
		} else {
			this.aFloat23 = this.aFloat24 = 1.0F;
			this.aBoolean185 = true;
		}
		this.anInt3085 = arg3;
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ih;IIIIIIZ)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat24 = (float) arg4 / (float) arg6;
		this.anInt3085 = arg3;
		this.aFloat23 = (float) arg3 / (float) arg5;
		this.aBoolean185 = false;
		this.anInt3088 = arg4;
		this.method2252(false, false);
	}
}
