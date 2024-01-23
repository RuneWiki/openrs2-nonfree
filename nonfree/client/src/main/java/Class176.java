import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class176 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!hl;")
	private Class62 aClass62_4;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Lclient!hl;")
	private Class62 aClass62_5;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
	public boolean aBoolean351 = true;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	private int anInt5349 = -1;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	private int anInt5348;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class176() {
		@Pc(9) GL local9 = Static178.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt5348 = local12[0];
		Static163.anInt3221 += 16384;
		Static178.method2763(this.anInt5348);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!tb;II)Z")
	public boolean method4242(@OriginalArg(0) Class59_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray65;
		@Pc(5) int local5 = arg0.anInt4748;
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
		if (local21 == this.anInt5349) {
			return false;
		}
		this.anInt5349 = local21;
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
					Static282.aByteArray72[local23++] = (byte) (local96 * 17);
				} else {
					Static282.aByteArray72[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static178.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static282.aByteArray72);
		local148.limit(16384);
		Static178.method2763(this.anInt5348);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
	public void method4243() {
		@Pc(1) GL local1 = Static178.aGL1;
		Static178.method2763(this.anInt5348);
		if (this.aClass62_4 == null) {
			if (Static178.aBoolean225) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer11);
			Static178.aBoolean227 = false;
		} else {
			this.aClass62_4.method1659();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static178.aBoolean227 = false;
		}
		if (this.aClass62_5 == null) {
			if (Static178.aBoolean225) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer12);
		} else {
			this.aClass62_5.method1658();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([[III)V")
	public void method4245(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class4_Sub17 local4 = new Class4_Sub17(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static178.aBoolean232) {
					local4.method1886((float) local11 / 8.0F);
					local4.method1886((float) local6 / 8.0F);
					local4.method1886((float) (local11 * 128));
					local4.method1886((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method1886((float) (local6 * 128));
				} else {
					local4.method1895((float) local11 / 8.0F);
					local4.method1895((float) local6 / 8.0F);
					local4.method1895((float) (local11 * 128));
					local4.method1895((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method1895((float) (local6 * 128));
				}
			}
		}
		if (Static178.aBoolean225) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray30, 0, local4.anInt2400);
			this.aClass62_4 = new Class62();
			this.aClass62_4.method1655(local112);
		} else {
			this.aByteBuffer11 = ByteBuffer.allocateDirect(local4.anInt2400).order(ByteOrder.nativeOrder());
			this.aByteBuffer11.put(local4.aByteArray30, 0, local4.anInt2400);
			this.aByteBuffer11.flip();
		}
		@Pc(147) Class4_Sub17 local147 = new Class4_Sub17(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static178.aBoolean232) {
					local147.method1854(local154 + (local11 + 1) * 9);
					local147.method1854(local154 + local11 * 9);
					local147.method1854(local154 + local11 * 9 + 1);
					local147.method1854(local154 + (local11 + 1) * 9);
					local147.method1854(local154 + local11 * 9 + 1);
					local147.method1854(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method1848(local154 + (local11 + 1) * 9);
					local147.method1848(local154 + local11 * 9);
					local147.method1848(local154 + local11 * 9 + 1);
					local147.method1848(local154 + (local11 + 1) * 9);
					local147.method1848(local154 + local11 * 9 + 1);
					local147.method1848(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static178.aBoolean225) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray30, 0, local147.anInt2400);
			this.aClass62_5 = new Class62();
			this.aClass62_5.method1656(local293);
		} else {
			this.aByteBuffer12 = ByteBuffer.allocateDirect(local147.anInt2400).order(ByteOrder.nativeOrder());
			this.aByteBuffer12.put(local147.aByteArray30, 0, local147.anInt2400);
			this.aByteBuffer12.flip();
		}
	}
}
