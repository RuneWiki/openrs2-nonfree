import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class21 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!ch;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Lclient!ch;")
	private Class30 aClass30_2;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Z")
	public boolean aBoolean28 = true;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	private int anInt421 = -1;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class21() {
		@Pc(9) GL local9 = Static291.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt422 = local12[0];
		Static74.anInt1418 += 16384;
		Static291.method4310(this.anInt422);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([[III)V")
	public void method427(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static291.aBoolean413) {
					local4.method2604((float) local11 / 8.0F);
					local4.method2604((float) local6 / 8.0F);
					local4.method2604((float) (local11 * 128));
					local4.method2604((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2604((float) (local6 * 128));
				} else {
					local4.method2594((float) local11 / 8.0F);
					local4.method2594((float) local6 / 8.0F);
					local4.method2594((float) (local11 * 128));
					local4.method2594((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2594((float) (local6 * 128));
				}
			}
		}
		if (Static291.aBoolean405) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray34, 0, local4.anInt3290);
			this.aClass30_1 = new Class30();
			this.aClass30_1.method544(local112);
		} else {
			this.aByteBuffer2 = ByteBuffer.allocateDirect(local4.anInt3290).order(ByteOrder.nativeOrder());
			this.aByteBuffer2.put(local4.aByteArray34, 0, local4.anInt3290);
			this.aByteBuffer2.flip();
		}
		@Pc(147) Class1_Sub14 local147 = new Class1_Sub14(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static291.aBoolean413) {
					local147.method2630(local154 + (local11 + 1) * 9);
					local147.method2630(local154 + local11 * 9);
					local147.method2630(local154 + local11 * 9 + 1);
					local147.method2630(local154 + (local11 + 1) * 9);
					local147.method2630(local154 + local11 * 9 + 1);
					local147.method2630(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method2611(local154 + (local11 + 1) * 9);
					local147.method2611(local154 + local11 * 9);
					local147.method2611(local154 + local11 * 9 + 1);
					local147.method2611(local154 + (local11 + 1) * 9);
					local147.method2611(local154 + local11 * 9 + 1);
					local147.method2611(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static291.aBoolean405) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray34, 0, local147.anInt3290);
			this.aClass30_2 = new Class30();
			this.aClass30_2.method540(local293);
		} else {
			this.aByteBuffer3 = ByteBuffer.allocateDirect(local147.anInt3290).order(ByteOrder.nativeOrder());
			this.aByteBuffer3.put(local147.aByteArray34, 0, local147.anInt3290);
			this.aByteBuffer3.flip();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	public void method428() {
		@Pc(1) GL local1 = Static291.aGL1;
		Static291.method4310(this.anInt422);
		if (this.aClass30_1 == null) {
			if (Static291.aBoolean405) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer2);
			Static291.aBoolean412 = false;
		} else {
			this.aClass30_1.method541();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static291.aBoolean412 = false;
		}
		if (this.aClass30_2 == null) {
			if (Static291.aBoolean405) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer3);
		} else {
			this.aClass30_2.method543();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!wi;II)Z")
	public boolean method429(@OriginalArg(0) Class103_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray74;
		@Pc(5) int local5 = arg0.anInt5857;
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
		if (local21 == this.anInt421) {
			return false;
		}
		this.anInt421 = local21;
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
					Static22.aByteArray2[local23++] = (byte) (local96 * 17);
				} else {
					Static22.aByteArray2[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static291.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static22.aByteArray2);
		local148.limit(16384);
		Static291.method4310(this.anInt422);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}
}
