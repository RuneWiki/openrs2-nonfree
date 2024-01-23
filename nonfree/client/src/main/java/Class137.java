import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class137 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public int anInt4160;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!lk;")
	private Class113 aClass113_5;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public int anInt4161;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!lk;")
	private Class113 aClass113_6;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public int anInt4162;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!ic;")
	private Class85 aClass85_19;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([I)V")
	public void method3444(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray437[this.anInt4162++] = arg0[0];
			this.anIntArray437[this.anInt4162++] = arg0[local1];
			this.anIntArray437[this.anInt4162++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	public void method3445() {
		this.anIntArray437 = new int[this.anInt4160];
		this.anIntArray439 = new int[this.anInt4159];
		this.anIntArray438 = new int[this.anInt4159];
		this.anIntArray436 = new int[this.anInt4159];
		this.aByteArray53 = new byte[this.anInt4159];
		this.aByteArray54 = new byte[this.anInt4159];
		this.aByteArray55 = new byte[this.anInt4159];
		this.aClass85_19 = new Class85(Static161.method2608(this.anInt4159));
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "()V")
	public void method3446() {
		@Pc(1) GL local1 = Static94.aGL1;
		if (Static94.aBoolean135) {
			this.aClass113_5.method2617();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static94.aBoolean136 = false;
			this.aClass113_6.method2616();
			local1.glDrawElements(4, this.anInt4162, 5125, 0L);
			return;
		}
		if (Static94.aBoolean135) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer13);
		Static94.aBoolean136 = false;
		local1.glDrawElements(4, this.anInt4162, 5125, this.aByteBuffer14);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "()V")
	public void method3447() {
		@Pc(7) Class4_Sub10 local7 = new Class4_Sub10(this.anInt4162 * 4);
		@Pc(15) Class4_Sub10 local15 = new Class4_Sub10(this.anInt4161 * 16);
		@Pc(19) int local19;
		if (Static94.aBoolean126) {
			for (local19 = 0; local19 < this.anInt4161; local19++) {
				local15.method4618(this.aByteArray53[local19]);
				local15.method4618(this.aByteArray54[local19]);
				local15.method4618(this.aByteArray55[local19]);
				local15.method4618(255);
				local15.method4641((float) this.anIntArray439[local19]);
				local15.method4641((float) this.anIntArray438[local19]);
				local15.method4641((float) this.anIntArray436[local19]);
			}
			for (local19 = 0; local19 < this.anInt4162; local19++) {
				local7.method4654(this.anIntArray437[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt4161; local19++) {
				local15.method4618(this.aByteArray53[local19]);
				local15.method4618(this.aByteArray54[local19]);
				local15.method4618(this.aByteArray55[local19]);
				local15.method4618(255);
				local15.method4669((float) this.anIntArray439[local19]);
				local15.method4669((float) this.anIntArray438[local19]);
				local15.method4669((float) this.anIntArray436[local19]);
			}
			for (local19 = 0; local19 < this.anInt4162; local19++) {
				local7.method4636(this.anIntArray437[local19]);
			}
		}
		if (Static94.aBoolean135) {
			this.aClass113_5 = new Class113();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray71);
			this.aClass113_5.method2615(local173);
			this.aClass113_6 = new Class113();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray71);
			this.aClass113_6.method2614(local186);
		} else {
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local15.anInt5713);
			this.aByteBuffer13.put(local15.aByteArray71);
			this.aByteBuffer13.flip();
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local7.anInt5713);
			this.aByteBuffer14.put(local7.aByteArray71);
			this.aByteBuffer14.flip();
		}
		this.anIntArray439 = null;
		this.anIntArray438 = null;
		this.anIntArray436 = null;
		this.aByteArray53 = null;
		this.aByteArray54 = null;
		this.aByteArray55 = null;
		this.anIntArray437 = null;
		this.aClass85_19 = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!em;IIIFFF)I")
	public int method3448(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class4_Sub32 local23 = (Class4_Sub32) this.aClass85_19.method1845(local1);
			if (local23 != null) {
				return local23.anInt5435;
			}
		}
		@Pc(31) int local31 = arg0.anInt1321;
		@Pc(37) float local37 = (float) (arg0.anInt1338 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt1322 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt1320 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt1318 << 7) + 64);
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
		this.aByteArray53[this.anInt4161] = (byte) local142;
		this.aByteArray54[this.anInt4161] = (byte) local157;
		this.aByteArray55[this.anInt4161] = (byte) local170;
		this.anIntArray439[this.anInt4161] = arg1;
		this.anIntArray438[this.anInt4161] = arg2;
		this.anIntArray436[this.anInt4161] = arg3;
		this.aClass85_19.method1841(new Class4_Sub32(this.anInt4161), local1);
		return this.anInt4161++;
	}
}
