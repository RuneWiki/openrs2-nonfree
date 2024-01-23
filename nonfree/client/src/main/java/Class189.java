import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class189 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!bk;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public int anInt6050;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public int anInt6051;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public int anInt6052;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public int anInt6053;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer15;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!bk;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!vl;")
	private Class186 aClass186_27;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public void method4639() {
		@Pc(1) GL local1 = Static294.aGL1;
		if (Static294.aBoolean381) {
			this.aClass21_6.method437();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static294.aBoolean374 = false;
			this.aClass21_7.method438();
			local1.glDrawElements(4, this.anInt6051, 5125, 0L);
			return;
		}
		if (Static294.aBoolean381) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer14);
		Static294.aBoolean374 = false;
		local1.glDrawElements(4, this.anInt6051, 5125, this.aByteBuffer15);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	public void method4640() {
		@Pc(7) Class1_Sub14 local7 = new Class1_Sub14(this.anInt6051 * 4);
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(this.anInt6050 * 16);
		@Pc(19) int local19;
		if (Static294.aBoolean377) {
			for (local19 = 0; local19 < this.anInt6050; local19++) {
				local15.method2191(this.aByteArray72[local19]);
				local15.method2191(this.aByteArray70[local19]);
				local15.method2191(this.aByteArray71[local19]);
				local15.method2191(255);
				local15.method2192((float) this.anIntArray536[local19]);
				local15.method2192((float) this.anIntArray539[local19]);
				local15.method2192((float) this.anIntArray537[local19]);
			}
			for (local19 = 0; local19 < this.anInt6051; local19++) {
				local7.method2236(this.anIntArray538[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt6050; local19++) {
				local15.method2191(this.aByteArray72[local19]);
				local15.method2191(this.aByteArray70[local19]);
				local15.method2191(this.aByteArray71[local19]);
				local15.method2191(255);
				local15.method2217((float) this.anIntArray536[local19]);
				local15.method2217((float) this.anIntArray539[local19]);
				local15.method2217((float) this.anIntArray537[local19]);
			}
			for (local19 = 0; local19 < this.anInt6051; local19++) {
				local7.method2233(this.anIntArray538[local19]);
			}
		}
		if (Static294.aBoolean381) {
			this.aClass21_6 = new Class21();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray55);
			this.aClass21_6.method436(local173);
			this.aClass21_7 = new Class21();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray55);
			this.aClass21_7.method434(local186);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local15.anInt3000);
			this.aByteBuffer14.put(local15.aByteArray55);
			this.aByteBuffer14.flip();
			this.aByteBuffer15 = ByteBuffer.allocateDirect(local7.anInt3000);
			this.aByteBuffer15.put(local7.aByteArray55);
			this.aByteBuffer15.flip();
		}
		this.anIntArray536 = null;
		this.anIntArray539 = null;
		this.anIntArray537 = null;
		this.aByteArray72 = null;
		this.aByteArray70 = null;
		this.aByteArray71 = null;
		this.anIntArray538 = null;
		this.aClass186_27 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([I)V")
	public void method4641(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray538[this.anInt6051++] = arg0[0];
			this.anIntArray538[this.anInt6051++] = arg0[local1];
			this.anIntArray538[this.anInt6051++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	public void method4642() {
		this.anIntArray538 = new int[this.anInt6053];
		this.anIntArray536 = new int[this.anInt6052];
		this.anIntArray539 = new int[this.anInt6052];
		this.anIntArray537 = new int[this.anInt6052];
		this.aByteArray72 = new byte[this.anInt6052];
		this.aByteArray70 = new byte[this.anInt6052];
		this.aByteArray71 = new byte[this.anInt6052];
		this.aClass186_27 = new Class186(Static315.method4766(this.anInt6052));
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!fn;IIIFFF)I")
	public int method4643(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class1_Sub17 local23 = (Class1_Sub17) this.aClass186_27.method4570(local1);
			if (local23 != null) {
				return local23.anInt3669;
			}
		}
		@Pc(31) int local31 = arg0.anInt1845;
		@Pc(37) float local37 = (float) (arg0.anInt1852 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt1848 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt1847 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt1842 << 7) + 64);
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
		this.aByteArray72[this.anInt6050] = (byte) local142;
		this.aByteArray70[this.anInt6050] = (byte) local157;
		this.aByteArray71[this.anInt6050] = (byte) local170;
		this.anIntArray536[this.anInt6050] = arg1;
		this.anIntArray539[this.anInt6050] = arg2;
		this.anIntArray537[this.anInt6050] = arg3;
		this.aClass186_27.method4575(local1, new Class1_Sub17(this.anInt6050));
		return this.anInt6050++;
	}
}
