import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class101 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!hb;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!hb;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private int anInt3418 = -1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Z")
	public boolean aBoolean247 = true;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	private int anInt3419;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class101() {
		@Pc(9) GL local9 = Static277.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt3419 = local12[0];
		Static94.anInt2206 += 16384;
		Static277.method4212(this.anInt3419);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public void method2755() {
		@Pc(1) GL local1 = Static277.aGL1;
		Static277.method4212(this.anInt3419);
		if (this.aClass57_3 == null) {
			if (Static277.aBoolean417) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer6);
			Static277.aBoolean419 = false;
		} else {
			this.aClass57_3.method1740();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static277.aBoolean419 = false;
		}
		if (this.aClass57_2 == null) {
			if (Static277.aBoolean417) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer5);
		} else {
			this.aClass57_2.method1741();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!tj;II)Z")
	public boolean method2756(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray66;
		@Pc(5) int local5 = arg0.anInt5018;
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
		if (local21 == this.anInt3418) {
			return false;
		}
		this.anInt3418 = local21;
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
					Static159.aByteArray48[local23++] = (byte) (local96 * 17);
				} else {
					Static159.aByteArray48[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static277.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static159.aByteArray48);
		local148.limit(16384);
		Static277.method4212(this.anInt3419);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([[III)V")
	public void method2758(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class1_Sub11 local4 = new Class1_Sub11(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static277.aBoolean418) {
					local4.method2684((float) local11 / 8.0F);
					local4.method2684((float) local6 / 8.0F);
					local4.method2684((float) (local11 * 128));
					local4.method2684((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2684((float) (local6 * 128));
				} else {
					local4.method2642((float) local11 / 8.0F);
					local4.method2642((float) local6 / 8.0F);
					local4.method2642((float) (local11 * 128));
					local4.method2642((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2642((float) (local6 * 128));
				}
			}
		}
		if (Static277.aBoolean417) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray47, 0, local4.anInt3264);
			this.aClass57_3 = new Class57();
			this.aClass57_3.method1739(local112);
		} else {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(local4.anInt3264).order(ByteOrder.nativeOrder());
			this.aByteBuffer6.put(local4.aByteArray47, 0, local4.anInt3264);
			this.aByteBuffer6.flip();
		}
		@Pc(147) Class1_Sub11 local147 = new Class1_Sub11(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static277.aBoolean418) {
					local147.method2659(local154 + (local11 + 1) * 9);
					local147.method2659(local154 + local11 * 9);
					local147.method2659(local154 + local11 * 9 + 1);
					local147.method2659(local154 + (local11 + 1) * 9);
					local147.method2659(local154 + local11 * 9 + 1);
					local147.method2659(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method2626(local154 + (local11 + 1) * 9);
					local147.method2626(local154 + local11 * 9);
					local147.method2626(local154 + local11 * 9 + 1);
					local147.method2626(local154 + (local11 + 1) * 9);
					local147.method2626(local154 + local11 * 9 + 1);
					local147.method2626(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static277.aBoolean417) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray47, 0, local147.anInt3264);
			this.aClass57_2 = new Class57();
			this.aClass57_2.method1738(local293);
		} else {
			this.aByteBuffer5 = ByteBuffer.allocateDirect(local147.anInt3264).order(ByteOrder.nativeOrder());
			this.aByteBuffer5.put(local147.aByteArray47, 0, local147.anInt3264);
			this.aByteBuffer5.flip();
		}
	}
}
