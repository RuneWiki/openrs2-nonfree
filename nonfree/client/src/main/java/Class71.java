import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class71 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!l;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!l;")
	private Class98 aClass98_2;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	private int anInt2097 = -1;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class71() {
		@Pc(9) GL local9 = Static116.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt2096 = local12[0];
		Static166.anInt3351 += 16384;
		Static116.method1897(this.anInt2096);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
	public void method1590() {
		@Pc(1) GL local1 = Static116.aGL1;
		Static116.method1897(this.anInt2096);
		if (this.aClass98_1 == null) {
			if (Static116.aBoolean195) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer1);
			Static116.aBoolean184 = false;
		} else {
			this.aClass98_1.method2260();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static116.aBoolean184 = false;
		}
		if (this.aClass98_2 == null) {
			if (Static116.aBoolean195) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer2);
		} else {
			this.aClass98_2.method2261();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([[III)V")
	public void method1592(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class8_Sub2 local4 = new Class8_Sub2(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static116.aBoolean189) {
					local4.method2383((float) local11 / 8.0F);
					local4.method2383((float) local6 / 8.0F);
					local4.method2383((float) (local11 * 128));
					local4.method2383((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2383((float) (local6 * 128));
				} else {
					local4.method2324((float) local11 / 8.0F);
					local4.method2324((float) local6 / 8.0F);
					local4.method2324((float) (local11 * 128));
					local4.method2324((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2324((float) (local6 * 128));
				}
			}
		}
		if (Static116.aBoolean195) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray24, 0, local4.anInt2955);
			this.aClass98_1 = new Class98();
			this.aClass98_1.method2263(local112);
		} else {
			this.aByteBuffer1 = ByteBuffer.allocateDirect(local4.anInt2955).order(ByteOrder.nativeOrder());
			this.aByteBuffer1.put(local4.aByteArray24, 0, local4.anInt2955);
			this.aByteBuffer1.flip();
		}
		@Pc(147) Class8_Sub2 local147 = new Class8_Sub2(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static116.aBoolean189) {
					local147.method2330(local154 + (local11 + 1) * 9);
					local147.method2330(local154 + local11 * 9);
					local147.method2330(local154 + local11 * 9 + 1);
					local147.method2330(local154 + (local11 + 1) * 9);
					local147.method2330(local154 + local11 * 9 + 1);
					local147.method2330(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method2332(local154 + (local11 + 1) * 9);
					local147.method2332(local154 + local11 * 9);
					local147.method2332(local154 + local11 * 9 + 1);
					local147.method2332(local154 + (local11 + 1) * 9);
					local147.method2332(local154 + local11 * 9 + 1);
					local147.method2332(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static116.aBoolean195) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray24, 0, local147.anInt2955);
			this.aClass98_2 = new Class98();
			this.aClass98_2.method2262(local293);
		} else {
			this.aByteBuffer2 = ByteBuffer.allocateDirect(local147.anInt2955).order(ByteOrder.nativeOrder());
			this.aByteBuffer2.put(local147.aByteArray24, 0, local147.anInt2955);
			this.aByteBuffer2.flip();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!wk;II)Z")
	public boolean method1593(@OriginalArg(0) Class43_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray77;
		@Pc(5) int local5 = arg0.anInt5710;
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
		if (local21 == this.anInt2097) {
			return false;
		}
		this.anInt2097 = local21;
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
					Static100.aByteArray12[local23++] = (byte) (local96 * 17);
				} else {
					Static100.aByteArray12[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static116.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static100.aByteArray12);
		local148.limit(16384);
		Static116.method1897(this.anInt2096);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}
}
