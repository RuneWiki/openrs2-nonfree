import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class142 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!ib;")
	private Class76 aClass76_5;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!cn;")
	private Class30 aClass30_27;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	public int anInt4298;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public int anInt4299;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!ib;")
	private Class76 aClass76_6;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "[I")
	private int[] anIntArray473;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public int anInt4301;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public void method3607() {
		this.anIntArray471 = new int[this.anInt4300];
		this.anIntArray474 = new int[this.anInt4299];
		this.anIntArray473 = new int[this.anInt4299];
		this.anIntArray472 = new int[this.anInt4299];
		this.aByteArray57 = new byte[this.anInt4299];
		this.aByteArray55 = new byte[this.anInt4299];
		this.aByteArray56 = new byte[this.anInt4299];
		this.aClass30_27 = new Class30(Static165.method2731(this.anInt4299));
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	public void method3608() {
		@Pc(7) Class3_Sub26 local7 = new Class3_Sub26(this.anInt4298 * 4);
		@Pc(15) Class3_Sub26 local15 = new Class3_Sub26(this.anInt4301 * 16);
		@Pc(19) int local19;
		if (Static283.aBoolean403) {
			for (local19 = 0; local19 < this.anInt4301; local19++) {
				local15.method3907(this.aByteArray57[local19]);
				local15.method3907(this.aByteArray55[local19]);
				local15.method3907(this.aByteArray56[local19]);
				local15.method3907(255);
				local15.method3933((float) this.anIntArray474[local19]);
				local15.method3933((float) this.anIntArray473[local19]);
				local15.method3933((float) this.anIntArray472[local19]);
			}
			for (local19 = 0; local19 < this.anInt4298; local19++) {
				local7.method3944(this.anIntArray471[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt4301; local19++) {
				local15.method3907(this.aByteArray57[local19]);
				local15.method3907(this.aByteArray55[local19]);
				local15.method3907(this.aByteArray56[local19]);
				local15.method3907(255);
				local15.method3934((float) this.anIntArray474[local19]);
				local15.method3934((float) this.anIntArray473[local19]);
				local15.method3934((float) this.anIntArray472[local19]);
			}
			for (local19 = 0; local19 < this.anInt4298; local19++) {
				local7.method3922(this.anIntArray471[local19]);
			}
		}
		if (Static283.aBoolean406) {
			this.aClass76_6 = new Class76();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray64);
			this.aClass76_6.method1830(local173);
			this.aClass76_5 = new Class76();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray64);
			this.aClass76_5.method1833(local186);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local15.anInt4615);
			this.aByteBuffer14.put(local15.aByteArray64);
			this.aByteBuffer14.flip();
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local7.anInt4615);
			this.aByteBuffer13.put(local7.aByteArray64);
			this.aByteBuffer13.flip();
		}
		this.anIntArray474 = null;
		this.anIntArray473 = null;
		this.anIntArray472 = null;
		this.aByteArray57 = null;
		this.aByteArray55 = null;
		this.aByteArray56 = null;
		this.anIntArray471 = null;
		this.aClass30_27 = null;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
	public void method3609() {
		@Pc(1) GL local1 = Static283.aGL1;
		if (Static283.aBoolean406) {
			this.aClass76_6.method1829();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static283.aBoolean396 = false;
			this.aClass76_5.method1831();
			local1.glDrawElements(4, this.anInt4298, 5125, 0L);
			return;
		}
		if (Static283.aBoolean406) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer14);
		Static283.aBoolean396 = false;
		local1.glDrawElements(4, this.anInt4298, 5125, this.aByteBuffer13);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!jn;IIIFFF)I")
	public int method3610(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class3_Sub8 local23 = (Class3_Sub8) this.aClass30_27.method663(local1);
			if (local23 != null) {
				return local23.anInt1237;
			}
		}
		@Pc(31) int local31 = arg0.anInt2635;
		@Pc(37) float local37 = (float) (arg0.anInt2630 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt2632 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt2639 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt2633 << 7) + 64);
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
		this.aByteArray57[this.anInt4301] = (byte) local142;
		this.aByteArray55[this.anInt4301] = (byte) local157;
		this.aByteArray56[this.anInt4301] = (byte) local170;
		this.anIntArray474[this.anInt4301] = arg1;
		this.anIntArray473[this.anInt4301] = arg2;
		this.anIntArray472[this.anInt4301] = arg3;
		this.aClass30_27.method668(new Class3_Sub8(this.anInt4301), local1);
		return this.anInt4301++;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([I)V")
	public void method3611(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray471[this.anInt4298++] = arg0[0];
			this.anIntArray471[this.anInt4298++] = arg0[local1];
			this.anIntArray471[this.anInt4298++] = arg0[local1 + 1];
		}
	}
}
