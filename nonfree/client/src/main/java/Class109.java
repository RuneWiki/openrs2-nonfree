import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class109 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!kf;")
	private Class95 aClass95_3;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!kf;")
	private Class95 aClass95_4;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	private int anInt3763 = -1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Z")
	public boolean aBoolean249 = true;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	private int anInt3764;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class109() {
		@Pc(9) GL local9 = Static116.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt3764 = local12[0];
		Static124.anInt2872 += 16384;
		Static116.method1945(this.anInt3764);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([[III)V")
	public void method3089(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static116.aBoolean180) {
					local4.method2147((float) local11 / 8.0F);
					local4.method2147((float) local6 / 8.0F);
					local4.method2147((float) (local11 * 128));
					local4.method2147((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2147((float) (local6 * 128));
				} else {
					local4.method2142((float) local11 / 8.0F);
					local4.method2142((float) local6 / 8.0F);
					local4.method2142((float) (local11 * 128));
					local4.method2142((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2142((float) (local6 * 128));
				}
			}
		}
		if (Static116.aBoolean186) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray17, 0, local4.anInt2789);
			this.aClass95_3 = new Class95();
			this.aClass95_3.method2650(local112);
		} else {
			this.aByteBuffer8 = ByteBuffer.allocateDirect(local4.anInt2789).order(ByteOrder.nativeOrder());
			this.aByteBuffer8.put(local4.aByteArray17, 0, local4.anInt2789);
			this.aByteBuffer8.flip();
		}
		@Pc(147) Class2_Sub16 local147 = new Class2_Sub16(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static116.aBoolean180) {
					local147.method2186(local154 + (local11 + 1) * 9);
					local147.method2186(local154 + local11 * 9);
					local147.method2186(local154 + local11 * 9 + 1);
					local147.method2186(local154 + (local11 + 1) * 9);
					local147.method2186(local154 + local11 * 9 + 1);
					local147.method2186(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method2181(local154 + (local11 + 1) * 9);
					local147.method2181(local154 + local11 * 9);
					local147.method2181(local154 + local11 * 9 + 1);
					local147.method2181(local154 + (local11 + 1) * 9);
					local147.method2181(local154 + local11 * 9 + 1);
					local147.method2181(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static116.aBoolean186) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray17, 0, local147.anInt2789);
			this.aClass95_4 = new Class95();
			this.aClass95_4.method2646(local293);
		} else {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(local147.anInt2789).order(ByteOrder.nativeOrder());
			this.aByteBuffer7.put(local147.aByteArray17, 0, local147.anInt2789);
			this.aByteBuffer7.flip();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public void method3090() {
		@Pc(1) GL local1 = Static116.aGL1;
		Static116.method1945(this.anInt3764);
		if (this.aClass95_3 == null) {
			if (Static116.aBoolean186) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer8);
			Static116.aBoolean189 = false;
		} else {
			this.aClass95_3.method2649();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static116.aBoolean189 = false;
		}
		if (this.aClass95_4 == null) {
			if (Static116.aBoolean186) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer7);
		} else {
			this.aClass95_4.method2647();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ka;II)Z")
	public boolean method3091(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray34;
		@Pc(5) int local5 = arg0.anInt4355;
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
		if (local21 == this.anInt3763) {
			return false;
		}
		this.anInt3763 = local21;
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
					Static171.aByteArray38[local23++] = (byte) (local96 * 17);
				} else {
					Static171.aByteArray38[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static116.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static171.aByteArray38);
		local148.limit(16384);
		Static116.method1945(this.anInt3764);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}
}
