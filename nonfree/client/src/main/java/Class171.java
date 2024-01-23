import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class171 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
	public int anInt5516;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!de;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public int anInt5517;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	public int anInt5518;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public int anInt5519;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!de;")
	private Class38 aClass38_7;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Lclient!ii;")
	private Class79 aClass79_22;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()V")
	public void method4434() {
		@Pc(1) GL local1 = Static60.aGL1;
		if (Static60.aBoolean110) {
			this.aClass38_6.method838();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static60.aBoolean107 = false;
			this.aClass38_7.method840();
			local1.glDrawElements(4, this.anInt5518, 5125, 0L);
			return;
		}
		if (Static60.aBoolean110) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer13);
		Static60.aBoolean107 = false;
		local1.glDrawElements(4, this.anInt5518, 5125, this.aByteBuffer14);
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
	public void method4435() {
		this.anIntArray486 = new int[this.anInt5519];
		this.anIntArray485 = new int[this.anInt5517];
		this.anIntArray487 = new int[this.anInt5517];
		this.anIntArray484 = new int[this.anInt5517];
		this.aByteArray77 = new byte[this.anInt5517];
		this.aByteArray75 = new byte[this.anInt5517];
		this.aByteArray76 = new byte[this.anInt5517];
		this.aClass79_22 = new Class79(Static7.method217(this.anInt5517));
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([I)V")
	public void method4436(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray486[this.anInt5518++] = arg0[0];
			this.anIntArray486[this.anInt5518++] = arg0[local1];
			this.anIntArray486[this.anInt5518++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "()V")
	public void method4437() {
		@Pc(7) Class2_Sub26 local7 = new Class2_Sub26(this.anInt5518 * 4);
		@Pc(15) Class2_Sub26 local15 = new Class2_Sub26(this.anInt5516 * 16);
		@Pc(19) int local19;
		if (Static60.aBoolean114) {
			for (local19 = 0; local19 < this.anInt5516; local19++) {
				local15.method4239(this.aByteArray77[local19]);
				local15.method4239(this.aByteArray75[local19]);
				local15.method4239(this.aByteArray76[local19]);
				local15.method4239(255);
				local15.method4266((float) this.anIntArray485[local19]);
				local15.method4266((float) this.anIntArray487[local19]);
				local15.method4266((float) this.anIntArray484[local19]);
			}
			for (local19 = 0; local19 < this.anInt5518; local19++) {
				local7.method4260(this.anIntArray486[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt5516; local19++) {
				local15.method4239(this.aByteArray77[local19]);
				local15.method4239(this.aByteArray75[local19]);
				local15.method4239(this.aByteArray76[local19]);
				local15.method4239(255);
				local15.method4244((float) this.anIntArray485[local19]);
				local15.method4244((float) this.anIntArray487[local19]);
				local15.method4244((float) this.anIntArray484[local19]);
			}
			for (local19 = 0; local19 < this.anInt5518; local19++) {
				local7.method4259(this.anIntArray486[local19]);
			}
		}
		if (Static60.aBoolean110) {
			this.aClass38_6 = new Class38();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray72);
			this.aClass38_6.method837(local173);
			this.aClass38_7 = new Class38();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray72);
			this.aClass38_7.method841(local186);
		} else {
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local15.anInt5328);
			this.aByteBuffer13.put(local15.aByteArray72);
			this.aByteBuffer13.flip();
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local7.anInt5328);
			this.aByteBuffer14.put(local7.aByteArray72);
			this.aByteBuffer14.flip();
		}
		this.anIntArray485 = null;
		this.anIntArray487 = null;
		this.anIntArray484 = null;
		this.aByteArray77 = null;
		this.aByteArray75 = null;
		this.aByteArray76 = null;
		this.anIntArray486 = null;
		this.aClass79_22 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!k;IIIFFF)I")
	public int method4438(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class2_Sub21 local23 = (Class2_Sub21) this.aClass79_22.method2002(local1);
			if (local23 != null) {
				return local23.anInt4234;
			}
		}
		@Pc(31) int local31 = arg0.anInt2638;
		@Pc(37) float local37 = (float) (arg0.anInt2635 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt2644 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt2649 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt2652 << 7) + 64);
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
		this.aByteArray77[this.anInt5516] = (byte) local142;
		this.aByteArray75[this.anInt5516] = (byte) local157;
		this.aByteArray76[this.anInt5516] = (byte) local170;
		this.anIntArray485[this.anInt5516] = arg1;
		this.anIntArray487[this.anInt5516] = arg2;
		this.anIntArray484[this.anInt5516] = arg3;
		this.aClass79_22.method1994(local1, new Class2_Sub21(this.anInt5516));
		return this.anInt5516++;
	}
}
