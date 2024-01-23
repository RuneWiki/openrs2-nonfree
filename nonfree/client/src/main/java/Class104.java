import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class104 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!lk;")
	private Class113 aClass113_3;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!lk;")
	private Class113 aClass113_4;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt2807 = -1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	public boolean aBoolean197 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt2806;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class104() {
		@Pc(9) GL local9 = Static94.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt2806 = local12[0];
		Static173.anInt3330 += 16384;
		Static94.method1600(this.anInt2806);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fe;II)Z")
	public boolean method2237(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray15;
		@Pc(5) int local5 = arg0.anInt3408;
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
		if (local21 == this.anInt2807) {
			return false;
		}
		this.anInt2807 = local21;
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
					Static144.aByteArray21[local23++] = (byte) (local96 * 17);
				} else {
					Static144.aByteArray21[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static94.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static144.aByteArray21);
		local148.limit(16384);
		Static94.method1600(this.anInt2806);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public void method2238() {
		@Pc(1) GL local1 = Static94.aGL1;
		Static94.method1600(this.anInt2806);
		if (this.aClass113_4 == null) {
			if (Static94.aBoolean135) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer7);
			Static94.aBoolean136 = false;
		} else {
			this.aClass113_4.method2617();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static94.aBoolean136 = false;
		}
		if (this.aClass113_3 == null) {
			if (Static94.aBoolean135) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer8);
		} else {
			this.aClass113_3.method2616();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[III)V")
	public void method2239(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class4_Sub10 local4 = new Class4_Sub10(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static94.aBoolean126) {
					local4.method4641((float) local11 / 8.0F);
					local4.method4641((float) local6 / 8.0F);
					local4.method4641((float) (local11 * 128));
					local4.method4641((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method4641((float) (local6 * 128));
				} else {
					local4.method4669((float) local11 / 8.0F);
					local4.method4669((float) local6 / 8.0F);
					local4.method4669((float) (local11 * 128));
					local4.method4669((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method4669((float) (local6 * 128));
				}
			}
		}
		if (Static94.aBoolean135) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray71, 0, local4.anInt5713);
			this.aClass113_4 = new Class113();
			this.aClass113_4.method2615(local112);
		} else {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(local4.anInt5713).order(ByteOrder.nativeOrder());
			this.aByteBuffer7.put(local4.aByteArray71, 0, local4.anInt5713);
			this.aByteBuffer7.flip();
		}
		@Pc(147) Class4_Sub10 local147 = new Class4_Sub10(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static94.aBoolean126) {
					local147.method4654(local154 + (local11 + 1) * 9);
					local147.method4654(local154 + local11 * 9);
					local147.method4654(local154 + local11 * 9 + 1);
					local147.method4654(local154 + (local11 + 1) * 9);
					local147.method4654(local154 + local11 * 9 + 1);
					local147.method4654(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method4636(local154 + (local11 + 1) * 9);
					local147.method4636(local154 + local11 * 9);
					local147.method4636(local154 + local11 * 9 + 1);
					local147.method4636(local154 + (local11 + 1) * 9);
					local147.method4636(local154 + local11 * 9 + 1);
					local147.method4636(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static94.aBoolean135) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray71, 0, local147.anInt5713);
			this.aClass113_3 = new Class113();
			this.aClass113_3.method2614(local293);
		} else {
			this.aByteBuffer8 = ByteBuffer.allocateDirect(local147.anInt5713).order(ByteOrder.nativeOrder());
			this.aByteBuffer8.put(local147.aByteArray71, 0, local147.anInt5713);
			this.aByteBuffer8.flip();
		}
	}
}
