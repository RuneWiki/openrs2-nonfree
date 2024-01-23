import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class179 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public int anInt5414;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	public int anInt5415;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public int anInt5416;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!hl;")
	private Class62 aClass62_6;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!hl;")
	private Class62 aClass62_7;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!lb;")
	private Class97 aClass97_25;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	public void method4300() {
		@Pc(7) Class4_Sub17 local7 = new Class4_Sub17(this.anInt5417 * 4);
		@Pc(15) Class4_Sub17 local15 = new Class4_Sub17(this.anInt5416 * 16);
		@Pc(19) int local19;
		if (Static178.aBoolean232) {
			for (local19 = 0; local19 < this.anInt5416; local19++) {
				local15.method1861(this.aByteArray76[local19]);
				local15.method1861(this.aByteArray77[local19]);
				local15.method1861(this.aByteArray75[local19]);
				local15.method1861(255);
				local15.method1886((float) this.anIntArray483[local19]);
				local15.method1886((float) this.anIntArray486[local19]);
				local15.method1886((float) this.anIntArray485[local19]);
			}
			for (local19 = 0; local19 < this.anInt5417; local19++) {
				local7.method1854(this.anIntArray484[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt5416; local19++) {
				local15.method1861(this.aByteArray76[local19]);
				local15.method1861(this.aByteArray77[local19]);
				local15.method1861(this.aByteArray75[local19]);
				local15.method1861(255);
				local15.method1895((float) this.anIntArray483[local19]);
				local15.method1895((float) this.anIntArray486[local19]);
				local15.method1895((float) this.anIntArray485[local19]);
			}
			for (local19 = 0; local19 < this.anInt5417; local19++) {
				local7.method1848(this.anIntArray484[local19]);
			}
		}
		if (Static178.aBoolean225) {
			this.aClass62_6 = new Class62();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray30);
			this.aClass62_6.method1655(local173);
			this.aClass62_7 = new Class62();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray30);
			this.aClass62_7.method1656(local186);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local15.anInt2400);
			this.aByteBuffer14.put(local15.aByteArray30);
			this.aByteBuffer14.flip();
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local7.anInt2400);
			this.aByteBuffer13.put(local7.aByteArray30);
			this.aByteBuffer13.flip();
		}
		this.anIntArray483 = null;
		this.anIntArray486 = null;
		this.anIntArray485 = null;
		this.aByteArray76 = null;
		this.aByteArray77 = null;
		this.aByteArray75 = null;
		this.anIntArray484 = null;
		this.aClass97_25 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([I)V")
	public void method4301(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray484[this.anInt5417++] = arg0[0];
			this.anIntArray484[this.anInt5417++] = arg0[local1];
			this.anIntArray484[this.anInt5417++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
	public void method4302() {
		@Pc(1) GL local1 = Static178.aGL1;
		if (Static178.aBoolean225) {
			this.aClass62_6.method1659();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static178.aBoolean227 = false;
			this.aClass62_7.method1658();
			local1.glDrawElements(4, this.anInt5417, 5125, 0L);
			return;
		}
		if (Static178.aBoolean225) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer14);
		Static178.aBoolean227 = false;
		local1.glDrawElements(4, this.anInt5417, 5125, this.aByteBuffer13);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!sj;IIIFFF)I")
	public int method4303(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class4_Sub19 local23 = (Class4_Sub19) this.aClass97_25.method2360(local1);
			if (local23 != null) {
				return local23.anInt2869;
			}
		}
		@Pc(31) int local31 = arg0.anInt4696;
		@Pc(37) float local37 = (float) (arg0.anInt4688 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt4687 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt4691 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt4700 << 7) + 64);
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
		this.aByteArray76[this.anInt5416] = (byte) local142;
		this.aByteArray77[this.anInt5416] = (byte) local157;
		this.aByteArray75[this.anInt5416] = (byte) local170;
		this.anIntArray483[this.anInt5416] = arg1;
		this.anIntArray486[this.anInt5416] = arg2;
		this.anIntArray485[this.anInt5416] = arg3;
		this.aClass97_25.method2364(new Class4_Sub19(this.anInt5416), local1);
		return this.anInt5416++;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
	public void method4304() {
		this.anIntArray484 = new int[this.anInt5414];
		this.anIntArray483 = new int[this.anInt5415];
		this.anIntArray486 = new int[this.anInt5415];
		this.anIntArray485 = new int[this.anInt5415];
		this.aByteArray76 = new byte[this.anInt5415];
		this.aByteArray77 = new byte[this.anInt5415];
		this.aByteArray75 = new byte[this.anInt5415];
		this.aClass97_25 = new Class97(Static74.method1127(this.anInt5415));
	}
}
