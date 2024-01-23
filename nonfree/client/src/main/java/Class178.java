import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class178 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	public int anInt6193;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	public int anInt6194;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
	private int[] anIntArray618;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!rl;")
	private Class141 aClass141_6;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!rl;")
	private Class141 aClass141_7;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	public int anInt6195;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public int anInt6196;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
	private int[] anIntArray619;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!ol;")
	private Class117 aClass117_23;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
	private int[] anIntArray620;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
	public void method4793() {
		@Pc(1) GL local1 = Static296.aGL1;
		if (Static296.aBoolean347) {
			this.aClass141_7.method4040();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static296.aBoolean333 = false;
			this.aClass141_6.method4039();
			local1.glDrawElements(4, this.anInt6195, 5125, 0L);
			return;
		}
		if (Static296.aBoolean347) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer14);
		Static296.aBoolean333 = false;
		local1.glDrawElements(4, this.anInt6195, 5125, this.aByteBuffer13);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([I)V")
	public void method4794(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray619[this.anInt6195++] = arg0[0];
			this.anIntArray619[this.anInt6195++] = arg0[local1];
			this.anIntArray619[this.anInt6195++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!mm;IIIFFF)I")
	public int method4795(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class1_Sub10 local23 = (Class1_Sub10) this.aClass117_23.method3438(local1);
			if (local23 != null) {
				return local23.anInt1508;
			}
		}
		@Pc(31) int local31 = arg0.anInt3864;
		@Pc(37) float local37 = (float) (arg0.anInt3861 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt3849 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt3854 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt3860 << 7) + 64);
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
		this.aByteArray76[this.anInt6196] = (byte) local142;
		this.aByteArray75[this.anInt6196] = (byte) local157;
		this.aByteArray77[this.anInt6196] = (byte) local170;
		this.anIntArray618[this.anInt6196] = arg1;
		this.anIntArray620[this.anInt6196] = arg2;
		this.anIntArray617[this.anInt6196] = arg3;
		this.aClass117_23.method3445(new Class1_Sub10(this.anInt6196), local1);
		return this.anInt6196++;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()V")
	public void method4796() {
		this.anIntArray619 = new int[this.anInt6194];
		this.anIntArray618 = new int[this.anInt6193];
		this.anIntArray620 = new int[this.anInt6193];
		this.anIntArray617 = new int[this.anInt6193];
		this.aByteArray76 = new byte[this.anInt6193];
		this.aByteArray75 = new byte[this.anInt6193];
		this.aByteArray77 = new byte[this.anInt6193];
		this.aClass117_23 = new Class117(Static227.method3943(this.anInt6193));
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "()V")
	public void method4797() {
		@Pc(7) Class1_Sub16 local7 = new Class1_Sub16(this.anInt6195 * 4);
		@Pc(15) Class1_Sub16 local15 = new Class1_Sub16(this.anInt6196 * 16);
		@Pc(19) int local19;
		if (Static296.aBoolean344) {
			for (local19 = 0; local19 < this.anInt6196; local19++) {
				local15.method2621(this.aByteArray76[local19]);
				local15.method2621(this.aByteArray75[local19]);
				local15.method2621(this.aByteArray77[local19]);
				local15.method2621(255);
				local15.method2601((float) this.anIntArray618[local19]);
				local15.method2601((float) this.anIntArray620[local19]);
				local15.method2601((float) this.anIntArray617[local19]);
			}
			for (local19 = 0; local19 < this.anInt6195; local19++) {
				local7.method2606(this.anIntArray619[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt6196; local19++) {
				local15.method2621(this.aByteArray76[local19]);
				local15.method2621(this.aByteArray75[local19]);
				local15.method2621(this.aByteArray77[local19]);
				local15.method2621(255);
				local15.method2629((float) this.anIntArray618[local19]);
				local15.method2629((float) this.anIntArray620[local19]);
				local15.method2629((float) this.anIntArray617[local19]);
			}
			for (local19 = 0; local19 < this.anInt6195; local19++) {
				local7.method2656(this.anIntArray619[local19]);
			}
		}
		if (Static296.aBoolean347) {
			this.aClass141_7 = new Class141();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray39);
			this.aClass141_7.method4041(local173);
			this.aClass141_6 = new Class141();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray39);
			this.aClass141_6.method4037(local186);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local15.anInt3328);
			this.aByteBuffer14.put(local15.aByteArray39);
			this.aByteBuffer14.flip();
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local7.anInt3328);
			this.aByteBuffer13.put(local7.aByteArray39);
			this.aByteBuffer13.flip();
		}
		this.anIntArray618 = null;
		this.anIntArray620 = null;
		this.anIntArray617 = null;
		this.aByteArray76 = null;
		this.aByteArray75 = null;
		this.aByteArray77 = null;
		this.anIntArray619 = null;
		this.aClass117_23 = null;
	}
}
