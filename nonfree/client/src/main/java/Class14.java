import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class14 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!fd;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!fd;")
	private Class52 aClass52_2;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Z")
	public boolean aBoolean37 = true;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	private int anInt465 = -1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class14() {
		@Pc(9) GL local9 = Static240.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt464 = local12[0];
		Static154.anInt2855 += 16384;
		Static240.method3789(this.anInt464);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	public void method357() {
		@Pc(1) GL local1 = Static240.aGL1;
		Static240.method3789(this.anInt464);
		if (this.aClass52_2 == null) {
			if (Static240.aBoolean372) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer2);
			Static240.aBoolean368 = false;
		} else {
			this.aClass52_2.method1197();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static240.aBoolean368 = false;
		}
		if (this.aClass52_1 == null) {
			if (Static240.aBoolean372) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer1);
		} else {
			this.aClass52_1.method1193();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([[III)V")
	public void method358(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class1_Sub18 local4 = new Class1_Sub18(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static240.aBoolean379) {
					local4.method3066((float) local11 / 8.0F);
					local4.method3066((float) local6 / 8.0F);
					local4.method3066((float) (local11 * 128));
					local4.method3066((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method3066((float) (local6 * 128));
				} else {
					local4.method3088((float) local11 / 8.0F);
					local4.method3088((float) local6 / 8.0F);
					local4.method3088((float) (local11 * 128));
					local4.method3088((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method3088((float) (local6 * 128));
				}
			}
		}
		if (Static240.aBoolean372) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray71, 0, local4.anInt3911);
			this.aClass52_2 = new Class52();
			this.aClass52_2.method1195(local112);
		} else {
			this.aByteBuffer2 = ByteBuffer.allocateDirect(local4.anInt3911).order(ByteOrder.nativeOrder());
			this.aByteBuffer2.put(local4.aByteArray71, 0, local4.anInt3911);
			this.aByteBuffer2.flip();
		}
		@Pc(147) Class1_Sub18 local147 = new Class1_Sub18(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static240.aBoolean379) {
					local147.method3119(local154 + (local11 + 1) * 9);
					local147.method3119(local154 + local11 * 9);
					local147.method3119(local154 + local11 * 9 + 1);
					local147.method3119(local154 + (local11 + 1) * 9);
					local147.method3119(local154 + local11 * 9 + 1);
					local147.method3119(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method3094(local154 + (local11 + 1) * 9);
					local147.method3094(local154 + local11 * 9);
					local147.method3094(local154 + local11 * 9 + 1);
					local147.method3094(local154 + (local11 + 1) * 9);
					local147.method3094(local154 + local11 * 9 + 1);
					local147.method3094(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static240.aBoolean372) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray71, 0, local147.anInt3911);
			this.aClass52_1 = new Class52();
			this.aClass52_1.method1194(local293);
		} else {
			this.aByteBuffer1 = ByteBuffer.allocateDirect(local147.anInt3911).order(ByteOrder.nativeOrder());
			this.aByteBuffer1.put(local147.aByteArray71, 0, local147.anInt3911);
			this.aByteBuffer1.flip();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!rg;II)Z")
	public boolean method359(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray77;
		@Pc(5) int local5 = arg0.anInt4754;
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
		if (local21 == this.anInt465) {
			return false;
		}
		this.anInt465 = local21;
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
					Static21.aByteArray3[local23++] = (byte) (local96 * 17);
				} else {
					Static21.aByteArray3[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static240.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static21.aByteArray3);
		local148.limit(16384);
		Static240.method3789(this.anInt464);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}
}
