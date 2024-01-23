import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class48 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Lclient!bk;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!bk;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "Z")
	public boolean aBoolean97 = true;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	private int anInt1420 = -1;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
	private int anInt1419;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class48() {
		@Pc(9) GL local9 = Static294.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt1419 = local12[0];
		Static113.anInt2465 += 16384;
		Static294.method4486(this.anInt1419);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "()V")
	public void method1152() {
		@Pc(1) GL local1 = Static294.aGL1;
		Static294.method4486(this.anInt1419);
		if (this.aClass21_2 == null) {
			if (Static294.aBoolean381) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer4);
			Static294.aBoolean374 = false;
		} else {
			this.aClass21_2.method437();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static294.aBoolean374 = false;
		}
		if (this.aClass21_3 == null) {
			if (Static294.aBoolean381) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer3);
		} else {
			this.aClass21_3.method438();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([[III)V")
	public void method1153(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static294.aBoolean377) {
					local4.method2192((float) local11 / 8.0F);
					local4.method2192((float) local6 / 8.0F);
					local4.method2192((float) (local11 * 128));
					local4.method2192((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2192((float) (local6 * 128));
				} else {
					local4.method2217((float) local11 / 8.0F);
					local4.method2217((float) local6 / 8.0F);
					local4.method2217((float) (local11 * 128));
					local4.method2217((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2217((float) (local6 * 128));
				}
			}
		}
		if (Static294.aBoolean381) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray55, 0, local4.anInt3000);
			this.aClass21_2 = new Class21();
			this.aClass21_2.method436(local112);
		} else {
			this.aByteBuffer4 = ByteBuffer.allocateDirect(local4.anInt3000).order(ByteOrder.nativeOrder());
			this.aByteBuffer4.put(local4.aByteArray55, 0, local4.anInt3000);
			this.aByteBuffer4.flip();
		}
		@Pc(147) Class1_Sub14 local147 = new Class1_Sub14(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static294.aBoolean377) {
					local147.method2236(local154 + (local11 + 1) * 9);
					local147.method2236(local154 + local11 * 9);
					local147.method2236(local154 + local11 * 9 + 1);
					local147.method2236(local154 + (local11 + 1) * 9);
					local147.method2236(local154 + local11 * 9 + 1);
					local147.method2236(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method2233(local154 + (local11 + 1) * 9);
					local147.method2233(local154 + local11 * 9);
					local147.method2233(local154 + local11 * 9 + 1);
					local147.method2233(local154 + (local11 + 1) * 9);
					local147.method2233(local154 + local11 * 9 + 1);
					local147.method2233(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static294.aBoolean381) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray55, 0, local147.anInt3000);
			this.aClass21_3 = new Class21();
			this.aClass21_3.method434(local293);
		} else {
			this.aByteBuffer3 = ByteBuffer.allocateDirect(local147.anInt3000).order(ByteOrder.nativeOrder());
			this.aByteBuffer3.put(local147.aByteArray55, 0, local147.anInt3000);
			this.aByteBuffer3.flip();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!lb;II)Z")
	public boolean method1154(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray57;
		@Pc(5) int local5 = arg0.anInt4753;
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
		if (local21 == this.anInt1420) {
			return false;
		}
		this.anInt1420 = local21;
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
					Static67.aByteArray46[local23++] = (byte) (local96 * 17);
				} else {
					Static67.aByteArray46[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static294.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static67.aByteArray46);
		local148.limit(16384);
		Static294.method4486(this.anInt1419);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}
}
