import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class73 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!il;")
	private Class86 aClass86_13;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public int anInt2148;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	public int anInt2149;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "Lclient!vj;")
	private Class181 aClass181_4;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!vj;")
	private Class181 aClass181_5;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "()V")
	public void method1943() {
		@Pc(1) GL local1 = Static71.aGL1;
		if (Static71.aBoolean159) {
			this.aClass181_5.method4481();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static71.aBoolean163 = false;
			this.aClass181_4.method4482();
			local1.glDrawElements(4, this.anInt2151, 5125, 0L);
			return;
		}
		if (Static71.aBoolean159) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer6);
		Static71.aBoolean163 = false;
		local1.glDrawElements(4, this.anInt2151, 5125, this.aByteBuffer5);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "()V")
	public void method1944() {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13(this.anInt2151 * 4);
		@Pc(15) Class1_Sub13 local15 = new Class1_Sub13(this.anInt2148 * 16);
		@Pc(19) int local19;
		if (Static71.aBoolean168) {
			for (local19 = 0; local19 < this.anInt2148; local19++) {
				local15.method1822(this.aByteArray68[local19]);
				local15.method1822(this.aByteArray66[local19]);
				local15.method1822(this.aByteArray67[local19]);
				local15.method1822(255);
				local15.method1881((float) this.anIntArray152[local19]);
				local15.method1881((float) this.anIntArray151[local19]);
				local15.method1881((float) this.anIntArray150[local19]);
			}
			for (local19 = 0; local19 < this.anInt2151; local19++) {
				local7.method1851(this.anIntArray153[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt2148; local19++) {
				local15.method1822(this.aByteArray68[local19]);
				local15.method1822(this.aByteArray66[local19]);
				local15.method1822(this.aByteArray67[local19]);
				local15.method1822(255);
				local15.method1848((float) this.anIntArray152[local19]);
				local15.method1848((float) this.anIntArray151[local19]);
				local15.method1848((float) this.anIntArray150[local19]);
			}
			for (local19 = 0; local19 < this.anInt2151; local19++) {
				local7.method1839(this.anIntArray153[local19]);
			}
		}
		if (Static71.aBoolean159) {
			this.aClass181_5 = new Class181();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray63);
			this.aClass181_5.method4480(local173);
			this.aClass181_4 = new Class181();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray63);
			this.aClass181_4.method4483(local186);
		} else {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(local15.anInt2018);
			this.aByteBuffer6.put(local15.aByteArray63);
			this.aByteBuffer6.flip();
			this.aByteBuffer5 = ByteBuffer.allocateDirect(local7.anInt2018);
			this.aByteBuffer5.put(local7.aByteArray63);
			this.aByteBuffer5.flip();
		}
		this.anIntArray152 = null;
		this.anIntArray151 = null;
		this.anIntArray150 = null;
		this.aByteArray68 = null;
		this.aByteArray66 = null;
		this.aByteArray67 = null;
		this.anIntArray153 = null;
		this.aClass86_13 = null;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "()V")
	public void method1945() {
		this.anIntArray153 = new int[this.anInt2149];
		this.anIntArray152 = new int[this.anInt2150];
		this.anIntArray151 = new int[this.anInt2150];
		this.anIntArray150 = new int[this.anInt2150];
		this.aByteArray68 = new byte[this.anInt2150];
		this.aByteArray66 = new byte[this.anInt2150];
		this.aByteArray67 = new byte[this.anInt2150];
		this.aClass86_13 = new Class86(Static138.method3842(this.anInt2150));
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ni;IIIFFF)I")
	public int method1946(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class1_Sub22 local23 = (Class1_Sub22) this.aClass86_13.method2136(local1);
			if (local23 != null) {
				return local23.anInt3973;
			}
		}
		@Pc(31) int local31 = arg0.anInt3564;
		@Pc(37) float local37 = (float) (arg0.anInt3551 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt3565 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt3569 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt3568 << 7) + 64);
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
		this.aByteArray68[this.anInt2148] = (byte) local142;
		this.aByteArray66[this.anInt2148] = (byte) local157;
		this.aByteArray67[this.anInt2148] = (byte) local170;
		this.anIntArray152[this.anInt2148] = arg1;
		this.anIntArray151[this.anInt2148] = arg2;
		this.anIntArray150[this.anInt2148] = arg3;
		this.aClass86_13.method2144(new Class1_Sub22(this.anInt2148), local1);
		return this.anInt2148++;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([I)V")
	public void method1947(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray153[this.anInt2151++] = arg0[0];
			this.anIntArray153[this.anInt2151++] = arg0[local1];
			this.anIntArray153[this.anInt2151++] = arg0[local1 + 1];
		}
	}
}
