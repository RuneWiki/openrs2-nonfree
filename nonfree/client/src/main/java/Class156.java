import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class156 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!me;")
	private Class107 aClass107_6;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Lclient!me;")
	private Class107 aClass107_7;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer15;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	private int anInt4936 = -1;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Z")
	public boolean aBoolean333 = true;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	private int anInt4937;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class156() {
		@Pc(9) GL local9 = Static251.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt4937 = local12[0];
		Static239.anInt4728 += 16384;
		Static251.method3892(this.anInt4937);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ta;II)Z")
	public boolean method3895(@OriginalArg(0) Class58_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray59;
		@Pc(5) int local5 = arg0.anInt5028;
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
		if (local21 == this.anInt4936) {
			return false;
		}
		this.anInt4936 = local21;
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
					Static252.aByteArray58[local23++] = (byte) (local96 * 17);
				} else {
					Static252.aByteArray58[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static251.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static252.aByteArray58);
		local148.limit(16384);
		Static251.method3892(this.anInt4937);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([[III)V")
	public void method3897(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class4_Sub24 local4 = new Class4_Sub24(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static251.aBoolean314) {
					local4.method3099((float) local11 / 8.0F);
					local4.method3099((float) local6 / 8.0F);
					local4.method3099((float) (local11 * 128));
					local4.method3099((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method3099((float) (local6 * 128));
				} else {
					local4.method3087((float) local11 / 8.0F);
					local4.method3087((float) local6 / 8.0F);
					local4.method3087((float) (local11 * 128));
					local4.method3087((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method3087((float) (local6 * 128));
				}
			}
		}
		if (Static251.aBoolean327) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray47, 0, local4.anInt3822);
			this.aClass107_7 = new Class107();
			this.aClass107_7.method2632(local112);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local4.anInt3822).order(ByteOrder.nativeOrder());
			this.aByteBuffer14.put(local4.aByteArray47, 0, local4.anInt3822);
			this.aByteBuffer14.flip();
		}
		@Pc(147) Class4_Sub24 local147 = new Class4_Sub24(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static251.aBoolean314) {
					local147.method3066(local154 + (local11 + 1) * 9);
					local147.method3066(local154 + local11 * 9);
					local147.method3066(local154 + local11 * 9 + 1);
					local147.method3066(local154 + (local11 + 1) * 9);
					local147.method3066(local154 + local11 * 9 + 1);
					local147.method3066(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method3103(local154 + (local11 + 1) * 9);
					local147.method3103(local154 + local11 * 9);
					local147.method3103(local154 + local11 * 9 + 1);
					local147.method3103(local154 + (local11 + 1) * 9);
					local147.method3103(local154 + local11 * 9 + 1);
					local147.method3103(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static251.aBoolean327) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray47, 0, local147.anInt3822);
			this.aClass107_6 = new Class107();
			this.aClass107_6.method2634(local293);
		} else {
			this.aByteBuffer15 = ByteBuffer.allocateDirect(local147.anInt3822).order(ByteOrder.nativeOrder());
			this.aByteBuffer15.put(local147.aByteArray47, 0, local147.anInt3822);
			this.aByteBuffer15.flip();
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "()V")
	public void method3898() {
		@Pc(1) GL local1 = Static251.aGL1;
		Static251.method3892(this.anInt4937);
		if (this.aClass107_7 == null) {
			if (Static251.aBoolean327) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer14);
			Static251.aBoolean325 = false;
		} else {
			this.aClass107_7.method2633();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static251.aBoolean325 = false;
		}
		if (this.aClass107_6 == null) {
			if (Static251.aBoolean327) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer15);
		} else {
			this.aClass107_6.method2635();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}
}
