import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class178 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!hb;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public int anInt5527;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
	private int[] anIntArray546;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	public int anInt5528;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!ik;")
	private Class70 aClass70_22;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
	private int[] anIntArray547;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
	private int[] anIntArray548;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
	private int[] anIntArray549;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!hb;")
	private Class57 aClass57_7;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
	public int anInt5530;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	public void method4390() {
		this.anIntArray549 = new int[this.anInt5530];
		this.anIntArray548 = new int[this.anInt5529];
		this.anIntArray546 = new int[this.anInt5529];
		this.anIntArray547 = new int[this.anInt5529];
		this.aByteArray75 = new byte[this.anInt5529];
		this.aByteArray76 = new byte[this.anInt5529];
		this.aByteArray74 = new byte[this.anInt5529];
		this.aClass70_22 = new Class70(Static161.method2789(this.anInt5529));
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([I)V")
	public void method4391(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray549[this.anInt5527++] = arg0[0];
			this.anIntArray549[this.anInt5527++] = arg0[local1];
			this.anIntArray549[this.anInt5527++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
	public void method4392() {
		@Pc(1) GL local1 = Static277.aGL1;
		if (Static277.aBoolean417) {
			this.aClass57_7.method1740();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static277.aBoolean419 = false;
			this.aClass57_6.method1741();
			local1.glDrawElements(4, this.anInt5527, 5125, 0L);
			return;
		}
		if (Static277.aBoolean417) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer14);
		Static277.aBoolean419 = false;
		local1.glDrawElements(4, this.anInt5527, 5125, this.aByteBuffer13);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!re;IIIFFF)I")
	public int method4393(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class1_Sub29 local23 = (Class1_Sub29) this.aClass70_22.method2075(local1);
			if (local23 != null) {
				return local23.anInt4792;
			}
		}
		@Pc(31) int local31 = arg0.anInt4497;
		@Pc(37) float local37 = (float) (arg0.anInt4502 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt4484 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt4490 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt4503 << 7) + 64);
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
		this.aByteArray75[this.anInt5528] = (byte) local142;
		this.aByteArray76[this.anInt5528] = (byte) local157;
		this.aByteArray74[this.anInt5528] = (byte) local170;
		this.anIntArray548[this.anInt5528] = arg1;
		this.anIntArray546[this.anInt5528] = arg2;
		this.anIntArray547[this.anInt5528] = arg3;
		this.aClass70_22.method2084(local1, new Class1_Sub29(this.anInt5528));
		return this.anInt5528++;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()V")
	public void method4394() {
		@Pc(7) Class1_Sub11 local7 = new Class1_Sub11(this.anInt5527 * 4);
		@Pc(15) Class1_Sub11 local15 = new Class1_Sub11(this.anInt5528 * 16);
		@Pc(19) int local19;
		if (Static277.aBoolean418) {
			for (local19 = 0; local19 < this.anInt5528; local19++) {
				local15.method2655(this.aByteArray75[local19]);
				local15.method2655(this.aByteArray76[local19]);
				local15.method2655(this.aByteArray74[local19]);
				local15.method2655(255);
				local15.method2684((float) this.anIntArray548[local19]);
				local15.method2684((float) this.anIntArray546[local19]);
				local15.method2684((float) this.anIntArray547[local19]);
			}
			for (local19 = 0; local19 < this.anInt5527; local19++) {
				local7.method2659(this.anIntArray549[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt5528; local19++) {
				local15.method2655(this.aByteArray75[local19]);
				local15.method2655(this.aByteArray76[local19]);
				local15.method2655(this.aByteArray74[local19]);
				local15.method2655(255);
				local15.method2642((float) this.anIntArray548[local19]);
				local15.method2642((float) this.anIntArray546[local19]);
				local15.method2642((float) this.anIntArray547[local19]);
			}
			for (local19 = 0; local19 < this.anInt5527; local19++) {
				local7.method2626(this.anIntArray549[local19]);
			}
		}
		if (Static277.aBoolean417) {
			this.aClass57_7 = new Class57();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray47);
			this.aClass57_7.method1739(local173);
			this.aClass57_6 = new Class57();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray47);
			this.aClass57_6.method1738(local186);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local15.anInt3264);
			this.aByteBuffer14.put(local15.aByteArray47);
			this.aByteBuffer14.flip();
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local7.anInt3264);
			this.aByteBuffer13.put(local7.aByteArray47);
			this.aByteBuffer13.flip();
		}
		this.anIntArray548 = null;
		this.anIntArray546 = null;
		this.anIntArray547 = null;
		this.aByteArray75 = null;
		this.aByteArray76 = null;
		this.aByteArray74 = null;
		this.anIntArray549 = null;
		this.aClass70_22 = null;
	}
}
