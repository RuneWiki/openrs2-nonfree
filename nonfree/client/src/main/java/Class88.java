import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class88 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!de;")
	private Class38 aClass38_3;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Lclient!de;")
	private Class38 aClass38_4;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	private int anInt2627 = -1;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Z")
	public boolean aBoolean206 = true;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	private int anInt2628;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class88() {
		@Pc(9) GL local9 = Static60.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt2628 = local12[0];
		Static256.anInt5188 += 16384;
		Static60.method1157(this.anInt2628);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	public void method2243() {
		@Pc(1) GL local1 = Static60.aGL1;
		Static60.method1157(this.anInt2628);
		if (this.aClass38_4 == null) {
			if (Static60.aBoolean110) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer7);
			Static60.aBoolean107 = false;
		} else {
			this.aClass38_4.method838();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static60.aBoolean107 = false;
		}
		if (this.aClass38_3 == null) {
			if (Static60.aBoolean110) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer6);
		} else {
			this.aClass38_3.method840();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!hk;II)Z")
	public boolean method2245(@OriginalArg(0) Class71_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray21;
		@Pc(5) int local5 = arg0.anInt5766;
		@Pc(19) int local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23;
		@Pc(33) int local33;
		for (local23 = -128; local23 < 0; local23++) {
			local21 = (local21 << 8) - local21;
			for (local33 = -128; local33 < 0; local33++) {
				if (local2[local19++] != 0) {
					local21++;
				}
			}
			local19 += local5 - 128;
		}
		if (local21 == this.anInt2627) {
			return false;
		}
		this.anInt2627 = local21;
		local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		local23 = 0;
		for (local33 = -128; local33 < 0; local33++) {
			for (@Pc(82) int local82 = -128; local82 < 0; local82++) {
				if (local2[local19] == 0) {
					@Pc(96) int local96 = 0;
					if (local2[local19 - 1] != 0) {
						local96++;
					}
					if (local2[local19 + 1] != 0) {
						local96++;
					}
					if (local2[local19 - local5] != 0) {
						local96++;
					}
					if (local2[local19 + local5] != 0) {
						local96++;
					}
					Static123.aByteArray24[local23++] = (byte) (local96 * 17);
				} else {
					Static123.aByteArray24[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static60.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static123.aByteArray24);
		local148.limit(16384);
		Static60.method1157(this.anInt2628);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([[III)V")
	public void method2246(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class2_Sub26 local4 = new Class2_Sub26(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static60.aBoolean114) {
					local4.method4266((float) local11 / 8.0F);
					local4.method4266((float) local6 / 8.0F);
					local4.method4266((float) (local11 * 128));
					local4.method4266((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method4266((float) (local6 * 128));
				} else {
					local4.method4244((float) local11 / 8.0F);
					local4.method4244((float) local6 / 8.0F);
					local4.method4244((float) (local11 * 128));
					local4.method4244((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method4244((float) (local6 * 128));
				}
			}
		}
		if (Static60.aBoolean110) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray72, 0, local4.anInt5328);
			this.aClass38_4 = new Class38();
			this.aClass38_4.method837(local112);
		} else {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(local4.anInt5328).order(ByteOrder.nativeOrder());
			this.aByteBuffer7.put(local4.aByteArray72, 0, local4.anInt5328);
			this.aByteBuffer7.flip();
		}
		@Pc(147) Class2_Sub26 local147 = new Class2_Sub26(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static60.aBoolean114) {
					local147.method4260(local154 + (local11 + 1) * 9);
					local147.method4260(local154 + local11 * 9);
					local147.method4260(local154 + local11 * 9 + 1);
					local147.method4260(local154 + (local11 + 1) * 9);
					local147.method4260(local154 + local11 * 9 + 1);
					local147.method4260(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method4259(local154 + (local11 + 1) * 9);
					local147.method4259(local154 + local11 * 9);
					local147.method4259(local154 + local11 * 9 + 1);
					local147.method4259(local154 + (local11 + 1) * 9);
					local147.method4259(local154 + local11 * 9 + 1);
					local147.method4259(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static60.aBoolean110) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray72, 0, local147.anInt5328);
			this.aClass38_3 = new Class38();
			this.aClass38_3.method841(local293);
		} else {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(local147.anInt5328).order(ByteOrder.nativeOrder());
			this.aByteBuffer6.put(local147.aByteArray72, 0, local147.anInt5328);
			this.aByteBuffer6.flip();
		}
	}
}
