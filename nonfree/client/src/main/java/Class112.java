import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class112 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!rl;")
	private Class141 aClass141_4;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!rl;")
	private Class141 aClass141_5;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer10;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Z")
	public boolean aBoolean209 = true;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	private int anInt4133 = -1;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	private int anInt4134;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class112() {
		@Pc(9) GL local9 = Static296.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt4134 = local12[0];
		Static237.anInt5215 += 16384;
		Static296.method4812(this.anInt4134);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ag;II)Z")
	public boolean method3324(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray1;
		@Pc(5) int local5 = arg0.anInt5432;
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
		if (local21 == this.anInt4133) {
			return false;
		}
		this.anInt4133 = local21;
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
					Static185.aByteArray54[local23++] = (byte) (local96 * 17);
				} else {
					Static185.aByteArray54[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static296.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static185.aByteArray54);
		local148.limit(16384);
		Static296.method4812(this.anInt4134);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([[III)V")
	public void method3325(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class1_Sub16 local4 = new Class1_Sub16(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static296.aBoolean344) {
					local4.method2601((float) local11 / 8.0F);
					local4.method2601((float) local6 / 8.0F);
					local4.method2601((float) (local11 * 128));
					local4.method2601((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2601((float) (local6 * 128));
				} else {
					local4.method2629((float) local11 / 8.0F);
					local4.method2629((float) local6 / 8.0F);
					local4.method2629((float) (local11 * 128));
					local4.method2629((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2629((float) (local6 * 128));
				}
			}
		}
		if (Static296.aBoolean347) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray39, 0, local4.anInt3328);
			this.aClass141_4 = new Class141();
			this.aClass141_4.method4041(local112);
		} else {
			this.aByteBuffer10 = ByteBuffer.allocateDirect(local4.anInt3328).order(ByteOrder.nativeOrder());
			this.aByteBuffer10.put(local4.aByteArray39, 0, local4.anInt3328);
			this.aByteBuffer10.flip();
		}
		@Pc(147) Class1_Sub16 local147 = new Class1_Sub16(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static296.aBoolean344) {
					local147.method2606(local154 + (local11 + 1) * 9);
					local147.method2606(local154 + local11 * 9);
					local147.method2606(local154 + local11 * 9 + 1);
					local147.method2606(local154 + (local11 + 1) * 9);
					local147.method2606(local154 + local11 * 9 + 1);
					local147.method2606(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method2656(local154 + (local11 + 1) * 9);
					local147.method2656(local154 + local11 * 9);
					local147.method2656(local154 + local11 * 9 + 1);
					local147.method2656(local154 + (local11 + 1) * 9);
					local147.method2656(local154 + local11 * 9 + 1);
					local147.method2656(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static296.aBoolean347) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray39, 0, local147.anInt3328);
			this.aClass141_5 = new Class141();
			this.aClass141_5.method4037(local293);
		} else {
			this.aByteBuffer9 = ByteBuffer.allocateDirect(local147.anInt3328).order(ByteOrder.nativeOrder());
			this.aByteBuffer9.put(local147.aByteArray39, 0, local147.anInt3328);
			this.aByteBuffer9.flip();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	public void method3326() {
		@Pc(1) GL local1 = Static296.aGL1;
		Static296.method4812(this.anInt4134);
		if (this.aClass141_4 == null) {
			if (Static296.aBoolean347) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer10);
			Static296.aBoolean333 = false;
		} else {
			this.aClass141_4.method4040();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static296.aBoolean333 = false;
		}
		if (this.aClass141_5 == null) {
			if (Static296.aBoolean347) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer9);
		} else {
			this.aClass141_5.method4039();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}
}
