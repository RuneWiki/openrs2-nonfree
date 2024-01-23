import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class76 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public int anInt2410;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!tm;")
	private Class163 aClass163_22;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	public int anInt2412;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "Lclient!me;")
	private Class107 aClass107_2;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Lclient!me;")
	private Class107 aClass107_3;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([I)V")
	public void method1963(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray206[this.anInt2410++] = arg0[0];
			this.anIntArray206[this.anInt2410++] = arg0[local1];
			this.anIntArray206[this.anInt2410++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!qb;IIIFFF)I")
	public int method1964(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) Class4_Sub25 local23 = (Class4_Sub25) this.aClass163_22.method4188(local1);
			if (local23 != null) {
				return local23.anInt3892;
			}
		}
		@Pc(31) int local31 = arg0.anInt4203;
		@Pc(37) float local37 = (float) (arg0.anInt4206 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt4217 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt4215 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt4210 << 7) + 64);
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
		this.aByteArray29[this.anInt2413] = (byte) local142;
		this.aByteArray31[this.anInt2413] = (byte) local157;
		this.aByteArray30[this.anInt2413] = (byte) local170;
		this.anIntArray207[this.anInt2413] = arg1;
		this.anIntArray208[this.anInt2413] = arg2;
		this.anIntArray209[this.anInt2413] = arg3;
		this.aClass163_22.method4181(local1, new Class4_Sub25(this.anInt2413));
		return this.anInt2413++;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
	public void method1965() {
		@Pc(1) GL local1 = Static251.aGL1;
		if (Static251.aBoolean327) {
			this.aClass107_3.method2633();
			local1.glInterleavedArrays(10787, 16, 0L);
			Static251.aBoolean325 = false;
			this.aClass107_2.method2635();
			local1.glDrawElements(4, this.anInt2410, 5125, 0L);
			return;
		}
		if (Static251.aBoolean327) {
			local1.glBindBufferARB(34962, 0);
			local1.glBindBufferARB(34963, 0);
		}
		local1.glInterleavedArrays(10787, 16, this.aByteBuffer6);
		Static251.aBoolean325 = false;
		local1.glDrawElements(4, this.anInt2410, 5125, this.aByteBuffer7);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()V")
	public void method1966() {
		@Pc(7) Class4_Sub24 local7 = new Class4_Sub24(this.anInt2410 * 4);
		@Pc(15) Class4_Sub24 local15 = new Class4_Sub24(this.anInt2413 * 16);
		@Pc(19) int local19;
		if (Static251.aBoolean314) {
			for (local19 = 0; local19 < this.anInt2413; local19++) {
				local15.method3116(this.aByteArray29[local19]);
				local15.method3116(this.aByteArray31[local19]);
				local15.method3116(this.aByteArray30[local19]);
				local15.method3116(255);
				local15.method3099((float) this.anIntArray207[local19]);
				local15.method3099((float) this.anIntArray208[local19]);
				local15.method3099((float) this.anIntArray209[local19]);
			}
			for (local19 = 0; local19 < this.anInt2410; local19++) {
				local7.method3066(this.anIntArray206[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt2413; local19++) {
				local15.method3116(this.aByteArray29[local19]);
				local15.method3116(this.aByteArray31[local19]);
				local15.method3116(this.aByteArray30[local19]);
				local15.method3116(255);
				local15.method3087((float) this.anIntArray207[local19]);
				local15.method3087((float) this.anIntArray208[local19]);
				local15.method3087((float) this.anIntArray209[local19]);
			}
			for (local19 = 0; local19 < this.anInt2410; local19++) {
				local7.method3103(this.anIntArray206[local19]);
			}
		}
		if (Static251.aBoolean327) {
			this.aClass107_3 = new Class107();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.aByteArray47);
			this.aClass107_3.method2632(local173);
			this.aClass107_2 = new Class107();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.aByteArray47);
			this.aClass107_2.method2634(local186);
		} else {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(local15.anInt3822);
			this.aByteBuffer6.put(local15.aByteArray47);
			this.aByteBuffer6.flip();
			this.aByteBuffer7 = ByteBuffer.allocateDirect(local7.anInt3822);
			this.aByteBuffer7.put(local7.aByteArray47);
			this.aByteBuffer7.flip();
		}
		this.anIntArray207 = null;
		this.anIntArray208 = null;
		this.anIntArray209 = null;
		this.aByteArray29 = null;
		this.aByteArray31 = null;
		this.aByteArray30 = null;
		this.anIntArray206 = null;
		this.aClass163_22 = null;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()V")
	public void method1967() {
		this.anIntArray206 = new int[this.anInt2412];
		this.anIntArray207 = new int[this.anInt2411];
		this.anIntArray208 = new int[this.anInt2411];
		this.anIntArray209 = new int[this.anInt2411];
		this.aByteArray29 = new byte[this.anInt2411];
		this.aByteArray31 = new byte[this.anInt2411];
		this.aByteArray30 = new byte[this.anInt2411];
		this.aClass163_22 = new Class163(Static308.method4715(this.anInt2411));
	}
}
