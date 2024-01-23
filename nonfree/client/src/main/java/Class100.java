import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class100 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!ch;")
	private Class30 aClass30_4;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	public int anInt2762;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public int anInt2763;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public int anInt2764;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!ch;")
	private Class30 aClass30_5;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public int anInt2765;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!s;")
	private Class156 aClass156_11;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	public void method2236() {
		this.anIntArray227 = new int[this.anInt2764];
		this.anIntArray229 = new int[this.anInt2765];
		this.anIntArray230 = new int[this.anInt2765];
		this.anIntArray228 = new int[this.anInt2765];
		this.aByteArray29 = new byte[this.anInt2765];
		this.aByteArray30 = new byte[this.anInt2765];
		this.aByteArray31 = new byte[this.anInt2765];
		this.aClass156_11 = new Class156(Static203.method3254(this.anInt2765));
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([I)V")
	public void method2237(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray227[this.anInt2763++] = arg0[0];
			this.anIntArray227[this.anInt2763++] = arg0[local1];
			this.anIntArray227[this.anInt2763++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!tm;IIIFFF)I")
	public int method2238(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class1_Sub13 local23 = (Class1_Sub13) this.aClass156_11.method3821(local1);
			if (local23 != null) {
				return local23.anInt2852;
			}
		}
		@Pc(31) int local31 = arg0.anInt5271;
		@Pc(37) float local37 = (float) (arg0.anInt5278 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt5279 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt5266 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt5280 << 7) + 64);
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
		this.aByteArray29[this.anInt2762] = (byte) local142;
		this.aByteArray30[this.anInt2762] = (byte) local157;
		this.aByteArray31[this.anInt2762] = (byte) local170;
		this.anIntArray229[this.anInt2762] = arg1;
		this.anIntArray230[this.anInt2762] = arg2;
		this.anIntArray228[this.anInt2762] = arg3;
		this.aClass156_11.method3816(local1, new Class1_Sub13(this.anInt2762));
		return this.anInt2762++;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()V")
	public void method2239() {
		@Pc(7) Class1_Sub14 local7 = new Class1_Sub14(this.anInt2763 * 4);
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(this.anInt2762 * 16);
		@Pc(19) int local19;
		if (Static291.aBoolean413) {
			for (local19 = 0; local19 < this.anInt2762; local19++) {
				local15.method2631(this.aByteArray29[local19]);
				local15.method2631(this.aByteArray30[local19]);
				local15.method2631(this.aByteArray31[local19]);
				local15.method2631(255);
				local15.method2604((float) this.anIntArray229[local19]);
				local15.method2604((float) this.anIntArray230[local19]);
				local15.method2604((float) this.anIntArray228[local19]);
			}
			for (local19 = 0; local19 < this.anInt2763; local19++) {
				local7.method2630(this.anIntArray227[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt2762; local19++) {
				local15.method2631(this.aByteArray29[local19]);
				local15.method2631(this.aByteArray30[local19]);
				local15.method2631(this.aByteArray31[local19]);
				local15.method2631(255);
				local15.method2594((float) this.anIntArray229[local19]);
				local15.method2594((float) this.anIntArray230[local19]);
				local15.method2594((float) this.anIntArray228[local19]);
			}
			for (local19 = 0; local19 < this.anInt2763; local19++) {
				local7.method2611(this.anIntArray227[local19]);
			}
		}
		if (Static291.aBoolean405) {
			this.aClass30_5 = new Class30();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray34);
			this.aClass30_5.method544(local173);
			this.aClass30_4 = new Class30();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray34);
			this.aClass30_4.method540(local186);
		} else {
			this.aByteBuffer5 = ByteBuffer.allocateDirect(local15.anInt3290);
			this.aByteBuffer5.put(local15.aByteArray34);
			this.aByteBuffer5.flip();
			this.aByteBuffer6 = ByteBuffer.allocateDirect(local7.anInt3290);
			this.aByteBuffer6.put(local7.aByteArray34);
			this.aByteBuffer6.flip();
		}
		this.anIntArray229 = null;
		this.anIntArray230 = null;
		this.anIntArray228 = null;
		this.aByteArray29 = null;
		this.aByteArray30 = null;
		this.aByteArray31 = null;
		this.anIntArray227 = null;
		this.aClass156_11 = null;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()V")
	public void method2240() {
		@Pc(1) GL local1 = Static291.aGL1;
		if (Static291.aBoolean405) {
			this.aClass30_5.method541();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static291.aBoolean412 = false;
			this.aClass30_4.method543();
			local1.glDrawElements(4, this.anInt2763, 5125, 0L);
			return;
		}
		if (Static291.aBoolean405) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer5);
		Static291.aBoolean412 = false;
		local1.glDrawElements(4, this.anInt2763, 5125, this.aByteBuffer6);
	}
}
