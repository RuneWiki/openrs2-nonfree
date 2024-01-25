import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
	private int anInt5073 = -1;

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
	private int anInt5077 = -1;

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
	public final int anInt5072;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!ac;II)V")
	public Class2_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt5072 = arg2;
		super.aClass5_Sub1_32.method352(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8326, arg2, arg2, 0, Static266.method4780(super.anInt8326), 5121, (byte[]) null, 0);
		}
		this.method6976(true);
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!ac;IIZ[[BI)V")
	public Class2_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5072 = arg2;
		super.aClass5_Sub1_32.method352(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8326, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method6976(true);
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!ac;IIZ[[I)V")
	public Class2_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt5072 = arg2;
		super.aClass5_Sub1_32.method352(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static574.method8010(super.anInt8326, super.aClass5_Sub1_32.anInt396, local30 + 34069, arg2, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8326, arg2, arg2, 0, 32993, super.aClass5_Sub1_32.anInt396, arg4[local30], 0);
			}
		}
		this.method6976(true);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	@Override
	public void method6971() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5073, this.anInt5077, 3553, 0, 0);
		this.anInt5073 = -1;
		this.anInt5077 = -1;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIB)V")
	public void method4155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt8325, 0);
		this.anInt5077 = arg0;
		this.anInt5073 = arg2;
	}
}
