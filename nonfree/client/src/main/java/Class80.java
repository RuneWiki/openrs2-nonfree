import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class80 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public int anInt2288;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public int anInt2290;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!l;")
	private Class98 aClass98_3;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Lclient!l;")
	private Class98 aClass98_4;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "Lclient!pd;")
	private Class129 aClass129_10;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public int anInt2291;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
	public void method1822() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (Static116.aBoolean195) {
			this.aClass98_3.method2260();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static116.aBoolean184 = false;
			this.aClass98_4.method2261();
			local1.glDrawElements(4, this.anInt2288, 5125, 0L);
			return;
		}
		if (Static116.aBoolean195) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer4);
		Static116.aBoolean184 = false;
		local1.glDrawElements(4, this.anInt2288, 5125, this.aByteBuffer3);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([I)V")
	public void method1823(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray183[this.anInt2288++] = arg0[0];
			this.anIntArray183[this.anInt2288++] = arg0[local1];
			this.anIntArray183[this.anInt2288++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
	public void method1824() {
		this.anIntArray183 = new int[this.anInt2290];
		this.anIntArray184 = new int[this.anInt2289];
		this.anIntArray182 = new int[this.anInt2289];
		this.anIntArray181 = new int[this.anInt2289];
		this.aByteArray15 = new byte[this.anInt2289];
		this.aByteArray14 = new byte[this.anInt2289];
		this.aByteArray16 = new byte[this.anInt2289];
		this.aClass129_10 = new Class129(Static95.method1518(this.anInt2289));
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ck;IIIFFF)I")
	public int method1825(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class8_Sub28 local23 = (Class8_Sub28) this.aClass129_10.method3043(local1);
			if (local23 != null) {
				return local23.anInt4870;
			}
		}
		@Pc(31) int local31 = arg0.anInt866;
		@Pc(37) float local37 = (float) (arg0.anInt863 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt862 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt877 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt876 << 7) + 64);
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
		this.aByteArray15[this.anInt2291] = (byte) local142;
		this.aByteArray14[this.anInt2291] = (byte) local157;
		this.aByteArray16[this.anInt2291] = (byte) local170;
		this.anIntArray184[this.anInt2291] = arg1;
		this.anIntArray182[this.anInt2291] = arg2;
		this.anIntArray181[this.anInt2291] = arg3;
		this.aClass129_10.method3039(new Class8_Sub28(this.anInt2291), local1);
		return this.anInt2291++;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()V")
	public void method1826() {
		@Pc(7) Class8_Sub2 local7 = new Class8_Sub2(this.anInt2288 * 4);
		@Pc(15) Class8_Sub2 local15 = new Class8_Sub2(this.anInt2291 * 16);
		@Pc(19) int local19;
		if (Static116.aBoolean189) {
			for (local19 = 0; local19 < this.anInt2291; local19++) {
				local15.method2340(this.aByteArray15[local19]);
				local15.method2340(this.aByteArray14[local19]);
				local15.method2340(this.aByteArray16[local19]);
				local15.method2340(255);
				local15.method2383((float) this.anIntArray184[local19]);
				local15.method2383((float) this.anIntArray182[local19]);
				local15.method2383((float) this.anIntArray181[local19]);
			}
			for (local19 = 0; local19 < this.anInt2288; local19++) {
				local7.method2330(this.anIntArray183[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt2291; local19++) {
				local15.method2340(this.aByteArray15[local19]);
				local15.method2340(this.aByteArray14[local19]);
				local15.method2340(this.aByteArray16[local19]);
				local15.method2340(255);
				local15.method2324((float) this.anIntArray184[local19]);
				local15.method2324((float) this.anIntArray182[local19]);
				local15.method2324((float) this.anIntArray181[local19]);
			}
			for (local19 = 0; local19 < this.anInt2288; local19++) {
				local7.method2332(this.anIntArray183[local19]);
			}
		}
		if (Static116.aBoolean195) {
			this.aClass98_3 = new Class98();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray24);
			this.aClass98_3.method2263(local173);
			this.aClass98_4 = new Class98();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray24);
			this.aClass98_4.method2262(local186);
		} else {
			this.aByteBuffer4 = ByteBuffer.allocateDirect(local15.anInt2955);
			this.aByteBuffer4.put(local15.aByteArray24);
			this.aByteBuffer4.flip();
			this.aByteBuffer3 = ByteBuffer.allocateDirect(local7.anInt2955);
			this.aByteBuffer3.put(local7.aByteArray24);
			this.aByteBuffer3.flip();
		}
		this.anIntArray184 = null;
		this.anIntArray182 = null;
		this.anIntArray181 = null;
		this.aByteArray15 = null;
		this.aByteArray14 = null;
		this.aByteArray16 = null;
		this.anIntArray183 = null;
		this.aClass129_10 = null;
	}
}
