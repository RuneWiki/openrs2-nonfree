import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub2_Sub2_Sub2_Sub1 extends Class1_Sub2_Sub2_Sub2 {

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!ek;)V")
	public Class1_Sub2_Sub2_Sub2_Sub1(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class1_Sub2_Sub2_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([I)V")
	@Override
	protected void method3190(@OriginalArg(0) int[] arg0) {
		this.anInt4064 = Static182.method2762(this.anInt5119);
		this.anInt4061 = Static182.method2762(this.anInt5112);
		@Pc(20) byte[] local20 = new byte[this.anInt4064 * this.anInt4061 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt4064 - this.anInt5119) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.anInt5112; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.anInt5119; local40++) {
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
		@Pc(96) GL local96 = Static240.aGL1;
		if (this.anInt4062 == -1) {
			@Pc(103) int[] local103 = new int[1];
			local96.glGenTextures(1, local103, 0);
			this.anInt4062 = local103[0];
		}
		Static240.method3789(this.anInt4062);
		local96.glTexImage2D(3553, 0, 6408, this.anInt4064, this.anInt4061, 0, 6408, 5121, local94);
		Static154.anInt2854 += local94.limit() - this.anInt4059;
		this.anInt4059 = local94.limit();
	}
}
