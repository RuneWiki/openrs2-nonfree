import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub2_Sub1_Sub1_Sub1 extends Class1_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class1_Sub2_Sub1_Sub1_Sub1(@OriginalArg(0) Class1_Sub2_Sub1_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class1_Sub2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([I)V")
	@Override
	protected void method2602(@OriginalArg(0) int[] arg0) {
		this.anInt2993 = Static218.method1098(this.anInt4444);
		this.anInt2995 = Static218.method1098(this.anInt4454);
		@Pc(20) byte[] local20 = new byte[this.anInt2993 * this.anInt2995 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt2993 - this.anInt4444) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.anInt4454; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.anInt4444; local40++) {
				@Pc(49) int local49 = arg0[local24++];
				if (local49 == 0) {
					local22 += 4;
				} else {
					local20[local22++] = (byte) (local49 >> 16);
					local20[local22++] = (byte) (local49 >> 8);
					local20[local22++] = (byte) local49;
					local20[local22++] = (byte) (local49 >> 24);
				}
			}
			local22 += local32;
		}
		@Pc(94) ByteBuffer local94 = ByteBuffer.wrap(local20);
		@Pc(96) GL local96 = Static156.aGL1;
		if (this.anInt2999 == -1) {
			@Pc(103) int[] local103 = new int[1];
			local96.glGenTextures(1, local103, 0);
			this.anInt2999 = local103[0];
		}
		Static156.method2699(this.anInt2999);
		local96.glTexImage2D(3553, 0, 6408, this.anInt2993, this.anInt2995, 0, 6408, 5121, local94);
		Static10.anInt143 += local94.limit() - this.anInt2996;
		this.anInt2996 = local94.limit();
	}
}
