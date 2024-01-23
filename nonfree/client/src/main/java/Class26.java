import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class26 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!qb;")
	private Class142 aClass142_3;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Lclient!an;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Lclient!an;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "()V")
	public void method591() {
		this.anIntArray37 = new int[this.anInt635];
		this.anIntArray34 = new int[this.anInt636];
		this.anIntArray35 = new int[this.anInt636];
		this.anIntArray36 = new int[this.anInt636];
		this.aByteArray4 = new byte[this.anInt636];
		this.aByteArray3 = new byte[this.anInt636];
		this.aByteArray5 = new byte[this.anInt636];
		this.aClass142_3 = new Class142(Static218.method1098(this.anInt636));
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()V")
	public void method592() {
		@Pc(7) Class1_Sub14 local7 = new Class1_Sub14(this.anInt633 * 4);
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(this.anInt634 * 16);
		@Pc(19) int local19;
		if (Static156.aBoolean212) {
			for (local19 = 0; local19 < this.anInt634; local19++) {
				local15.method1390(this.aByteArray4[local19]);
				local15.method1390(this.aByteArray3[local19]);
				local15.method1390(this.aByteArray5[local19]);
				local15.method1390(255);
				local15.method1388((float) this.anIntArray34[local19]);
				local15.method1388((float) this.anIntArray35[local19]);
				local15.method1388((float) this.anIntArray36[local19]);
			}
			for (local19 = 0; local19 < this.anInt633; local19++) {
				local7.method1387(this.anIntArray37[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt634; local19++) {
				local15.method1390(this.aByteArray4[local19]);
				local15.method1390(this.aByteArray3[local19]);
				local15.method1390(this.aByteArray5[local19]);
				local15.method1390(255);
				local15.method1395((float) this.anIntArray34[local19]);
				local15.method1395((float) this.anIntArray35[local19]);
				local15.method1395((float) this.anIntArray36[local19]);
			}
			for (local19 = 0; local19 < this.anInt633; local19++) {
				local7.method1347(this.anIntArray37[local19]);
			}
		}
		if (Static156.aBoolean206) {
			this.aClass12_1 = new Class12();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray17);
			this.aClass12_1.method178(local173);
			this.aClass12_2 = new Class12();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray17);
			this.aClass12_2.method182(local186);
		} else {
			this.aByteBuffer4 = ByteBuffer.allocateDirect(local15.anInt1480);
			this.aByteBuffer4.put(local15.aByteArray17);
			this.aByteBuffer4.flip();
			this.aByteBuffer3 = ByteBuffer.allocateDirect(local7.anInt1480);
			this.aByteBuffer3.put(local7.aByteArray17);
			this.aByteBuffer3.flip();
		}
		this.anIntArray34 = null;
		this.anIntArray35 = null;
		this.anIntArray36 = null;
		this.aByteArray4 = null;
		this.aByteArray3 = null;
		this.aByteArray5 = null;
		this.anIntArray37 = null;
		this.aClass142_3 = null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!h;IIIFFF)I")
	public int method593(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class1_Sub1 local23 = (Class1_Sub1) this.aClass142_3.method3543(local1);
			if (local23 != null) {
				return local23.anInt12;
			}
		}
		@Pc(31) int local31 = arg0.anInt1991;
		@Pc(37) float local37 = (float) (arg0.anInt2004 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt1993 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt2006 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt2002 << 7) + 64);
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
		this.aByteArray4[this.anInt634] = (byte) local142;
		this.aByteArray3[this.anInt634] = (byte) local157;
		this.aByteArray5[this.anInt634] = (byte) local170;
		this.anIntArray34[this.anInt634] = arg1;
		this.anIntArray35[this.anInt634] = arg2;
		this.anIntArray36[this.anInt634] = arg3;
		this.aClass142_3.method3537(new Class1_Sub1(this.anInt634), local1);
		return this.anInt634++;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "()V")
	public void method594() {
		@Pc(1) GL local1 = Static156.aGL1;
		if (Static156.aBoolean206) {
			this.aClass12_1.method179();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static156.aBoolean209 = false;
			this.aClass12_2.method181();
			local1.glDrawElements(4, this.anInt633, 5125, 0L);
			return;
		}
		if (Static156.aBoolean206) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer4);
		Static156.aBoolean209 = false;
		local1.glDrawElements(4, this.anInt633, 5125, this.aByteBuffer3);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([I)V")
	public void method595(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray37[this.anInt633++] = arg0[0];
			this.anIntArray37[this.anInt633++] = arg0[local1];
			this.anIntArray37[this.anInt633++] = arg0[local1 + 1];
		}
	}
}
