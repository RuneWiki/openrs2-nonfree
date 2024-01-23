import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class183 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!kf;")
	private Class95 aClass95_5;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!l;")
	private Class101 aClass101_23;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public int anInt5699;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	public int anInt5700;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
	private int[] anIntArray559;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!kf;")
	private Class95 aClass95_6;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	public int anInt5701;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public int anInt5702;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method4495() {
		@Pc(7) Class2_Sub16 local7 = new Class2_Sub16(this.anInt5701 * 4);
		@Pc(15) Class2_Sub16 local15 = new Class2_Sub16(this.anInt5702 * 16);
		@Pc(19) int local19;
		if (Static116.aBoolean180) {
			for (local19 = 0; local19 < this.anInt5702; local19++) {
				local15.method2168(this.aByteArray70[local19]);
				local15.method2168(this.aByteArray69[local19]);
				local15.method2168(this.aByteArray71[local19]);
				local15.method2168(255);
				local15.method2147((float) this.anIntArray558[local19]);
				local15.method2147((float) this.anIntArray560[local19]);
				local15.method2147((float) this.anIntArray559[local19]);
			}
			for (local19 = 0; local19 < this.anInt5701; local19++) {
				local7.method2186(this.anIntArray557[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt5702; local19++) {
				local15.method2168(this.aByteArray70[local19]);
				local15.method2168(this.aByteArray69[local19]);
				local15.method2168(this.aByteArray71[local19]);
				local15.method2168(255);
				local15.method2142((float) this.anIntArray558[local19]);
				local15.method2142((float) this.anIntArray560[local19]);
				local15.method2142((float) this.anIntArray559[local19]);
			}
			for (local19 = 0; local19 < this.anInt5701; local19++) {
				local7.method2181(this.anIntArray557[local19]);
			}
		}
		if (Static116.aBoolean186) {
			this.aClass95_5 = new Class95();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray17);
			this.aClass95_5.method2650(local173);
			this.aClass95_6 = new Class95();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray17);
			this.aClass95_6.method2646(local186);
		} else {
			this.aByteBuffer12 = ByteBuffer.allocateDirect(local15.anInt2789);
			this.aByteBuffer12.put(local15.aByteArray17);
			this.aByteBuffer12.flip();
			this.aByteBuffer11 = ByteBuffer.allocateDirect(local7.anInt2789);
			this.aByteBuffer11.put(local7.aByteArray17);
			this.aByteBuffer11.flip();
		}
		this.anIntArray558 = null;
		this.anIntArray560 = null;
		this.anIntArray559 = null;
		this.aByteArray70 = null;
		this.aByteArray69 = null;
		this.aByteArray71 = null;
		this.anIntArray557 = null;
		this.aClass101_23 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I)V")
	public void method4496(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray557[this.anInt5701++] = arg0[0];
			this.anIntArray557[this.anInt5701++] = arg0[local1];
			this.anIntArray557[this.anInt5701++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()V")
	public void method4497() {
		this.anIntArray557 = new int[this.anInt5700];
		this.anIntArray558 = new int[this.anInt5699];
		this.anIntArray560 = new int[this.anInt5699];
		this.anIntArray559 = new int[this.anInt5699];
		this.aByteArray70 = new byte[this.anInt5699];
		this.aByteArray69 = new byte[this.anInt5699];
		this.aByteArray71 = new byte[this.anInt5699];
		this.aClass101_23 = new Class101(Static305.method4628(this.anInt5699));
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!sd;IIIFFF)I")
	public int method4498(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class2_Sub25 local23 = (Class2_Sub25) this.aClass101_23.method2867(local1);
			if (local23 != null) {
				return local23.anInt4838;
			}
		}
		@Pc(31) int local31 = arg0.anInt4994;
		@Pc(37) float local37 = (float) (arg0.anInt4995 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt4986 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt4984 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt4977 << 7) + 64);
		@Pc(96) float local96 = 1.0F - local90 * local90;
		if (local96 < 0.0F) {
			local96 = 0.0F;
		}
		@Pc(114) float local114 = local72 * arg4 + local76 * arg5 + local80 * arg6;
		if (local114 < 0.0F) {
			local114 = 0.0F;
		}
		@Pc(126) float local126 = local114 * local96 * 2.0F;
		if (local126 > 1.0F) {
			local126 = 1.0F;
		}
		@Pc(142) int local142 = (int) (local126 * (float) (local31 >> 16 & 0xFF));
		if (local142 > 255) {
			local142 = 255;
		}
		@Pc(157) int local157 = (int) (local126 * (float) (local31 >> 8 & 0xFF));
		if (local157 > 255) {
			local157 = 255;
		}
		@Pc(170) int local170 = (int) (local126 * (float) (local31 & 0xFF));
		if (local170 > 255) {
			local170 = 255;
		}
		this.aByteArray70[this.anInt5702] = (byte) local142;
		this.aByteArray69[this.anInt5702] = (byte) local157;
		this.aByteArray71[this.anInt5702] = (byte) local170;
		this.anIntArray558[this.anInt5702] = arg1;
		this.anIntArray560[this.anInt5702] = arg2;
		this.anIntArray559[this.anInt5702] = arg3;
		this.aClass101_23.method2860(new Class2_Sub25(this.anInt5702), local1);
		return this.anInt5702++;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()V")
	public void method4499() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (Static116.aBoolean186) {
			this.aClass95_5.method2649();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static116.aBoolean189 = false;
			this.aClass95_6.method2647();
			local1.glDrawElements(4, this.anInt5701, 5125, 0L);
			return;
		}
		if (Static116.aBoolean186) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer12);
		Static116.aBoolean189 = false;
		local1.glDrawElements(4, this.anInt5701, 5125, this.aByteBuffer11);
	}
}
