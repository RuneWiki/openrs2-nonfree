import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Lclient!hl;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "[F")
	private float[] aFloatArray10;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "[F")
	private float[] aFloatArray11;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "[F")
	private float[] aFloatArray12;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "[F")
	private float[] aFloatArray13;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "Lclient!lb;")
	private Class97 aClass97_7;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	private int anInt1874 = 0;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	private int anInt1876 = 0;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	public int anInt1877 = 0;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
	private int anInt1878 = 0;

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
	public int anInt1880 = 0;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	public int anInt1873 = 0;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
	public int anInt1879;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "Z")
	private boolean aBoolean141;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public int anInt1875;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IFZZI)V")
	public Class4_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt1879 = arg0;
		this.aFloat14 = arg1;
		this.aBoolean140 = arg2;
		this.aBoolean141 = arg3;
		this.anInt1875 = arg4;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I[IZ)I")
	public int method1451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean140) {
			this.anIntArrayArray18[this.anInt1878] = arg4;
			this.aBooleanArray14[this.anInt1878] = arg5;
			if (arg4 != null) {
				this.anInt1876 += arg4.length;
			}
			if (arg5) {
				this.anInt1876 += (arg3.length - 2) * 3;
			} else {
				this.anInt1874 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt1874 += (arg3.length - 2) * 3;
		}
		this.anIntArray199[this.anInt1878] = arg0;
		this.anIntArray198[this.anInt1878] = arg1;
		this.anIntArray200[this.anInt1878] = arg2;
		this.anIntArrayArray19[this.anInt1878] = arg3;
		return this.anInt1878++;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()V")
	public void method1452() {
		@Pc(12) Class4_Sub17 local12 = new Class4_Sub17((this.aBoolean141 ? 40 : 36) * this.anInt1873);
		for (@Pc(14) int local14 = 0; local14 < this.anInt1873; local14++) {
			if (Static178.aBoolean232) {
				local12.method1886((float) this.anIntArray201[local14]);
				local12.method1886((float) this.anIntArray202[local14]);
				local12.method1886((float) this.anIntArray197[local14]);
				local12.method1854(this.anIntArray203[local14]);
				local12.method1886(this.aFloatArray13[local14]);
				local12.method1886(this.aFloatArray11[local14]);
				local12.method1886(this.aFloatArray10[local14]);
				local12.method1886((float) this.anIntArray201[local14] / this.aFloat14);
				local12.method1886((float) this.anIntArray197[local14] / this.aFloat14);
				if (this.aBoolean141) {
					local12.method1886(this.aFloatArray12[local14]);
				}
			} else {
				local12.method1895((float) this.anIntArray201[local14]);
				local12.method1895((float) this.anIntArray202[local14]);
				local12.method1895((float) this.anIntArray197[local14]);
				local12.method1854(this.anIntArray203[local14]);
				local12.method1895(this.aFloatArray13[local14]);
				local12.method1895(this.aFloatArray11[local14]);
				local12.method1895(this.aFloatArray10[local14]);
				local12.method1895((float) this.anIntArray201[local14] / this.aFloat14);
				local12.method1895((float) this.anIntArray197[local14] / this.aFloat14);
				if (this.aBoolean141) {
					local12.method1895(this.aFloatArray12[local14]);
				}
			}
		}
		if (Static178.aBoolean225) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray30, 0, local12.anInt2400);
			this.aClass62_1 = new Class62();
			this.aClass62_1.method1655(local200);
		} else {
			this.aByteBuffer4 = ByteBuffer.allocateDirect(local12.anInt2400).order(ByteOrder.nativeOrder());
			this.aByteBuffer4.put(local12.aByteArray30, 0, local12.anInt2400);
			this.aByteBuffer4.flip();
		}
		this.anIntArray201 = null;
		this.anIntArray202 = null;
		this.anIntArray197 = null;
		this.anIntArray203 = null;
		this.aFloatArray13 = null;
		this.aFloatArray11 = null;
		this.aFloatArray10 = null;
		this.aClass97_7 = null;
		this.aFloatArray12 = null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([[[Lclient!dk;FZ)V")
	public void method1453(@OriginalArg(0) Class4_Sub11[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static91.aClass4_Sub17_2 == null || Static91.aClass4_Sub17_2.aByteArray30.length < this.anInt1874 * 4) {
			Static91.aClass4_Sub17_2 = new Class4_Sub17(this.anInt1874 * 4);
		} else {
			Static91.aClass4_Sub17_2.anInt2400 = 0;
		}
		if (Static91.aClass4_Sub17_3 == null || Static91.aClass4_Sub17_3.aByteArray30.length < this.anInt1876 * 4) {
			Static91.aClass4_Sub17_3 = new Class4_Sub17(this.anInt1876 * 4);
		} else {
			Static91.aClass4_Sub17_3.anInt2400 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class4_Sub11 local68;
		@Pc(111) Class4_Sub17 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static178.aBoolean232) {
			for (local47 = 0; local47 < this.anInt1878; local47++) {
				local68 = arg0[this.anIntArray199[local47]][this.anIntArray198[local47]][this.anIntArray200[local47]];
				if (local68 != null && local68.aBoolean76) {
					local78 = this.anIntArrayArray19[local47];
					if (this.aBoolean140) {
						local86 = this.anIntArrayArray18[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static91.aClass4_Sub17_3.method1854(local86[local90]);
							}
						}
						local111 = this.aBooleanArray14[local47] ? Static91.aClass4_Sub17_3 : Static91.aClass4_Sub17_2;
					} else {
						local111 = Static91.aClass4_Sub17_2;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method1854(local78[0]);
						local111.method1854(local78[local116]);
						local111.method1854(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt1878; local47++) {
				local68 = arg0[this.anIntArray199[local47]][this.anIntArray198[local47]][this.anIntArray200[local47]];
				if (local68 != null && local68.aBoolean76) {
					local78 = this.anIntArrayArray19[local47];
					if (this.aBoolean140) {
						local86 = this.anIntArrayArray18[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static91.aClass4_Sub17_3.method1848(local86[local90]);
							}
						}
						local111 = this.aBooleanArray14[local47] ? Static91.aClass4_Sub17_3 : Static91.aClass4_Sub17_2;
					} else {
						local111 = Static91.aClass4_Sub17_2;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method1848(local78[0]);
						local111.method1848(local78[local116]);
						local111.method1848(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static91.aClass4_Sub17_2.anInt2400 == 0 && Static91.aClass4_Sub17_3.anInt2400 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static178.aGL1;
		if (this.anInt1879 == -1 || arg2) {
			Static178.method2763(-1);
			Static32.method479(0, 0);
		} else {
			Static204.anInterface2_1.method1973(this.anInt1879);
		}
		@Pc(282) int local282 = this.aBoolean141 ? 40 : 36;
		if (this.aClass62_1 == null) {
			if (Static178.aBoolean225) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer4.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer4);
			this.aByteBuffer4.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer4);
			if (Static298.aBoolean357) {
				this.aByteBuffer4.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer4);
			}
			this.aByteBuffer4.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer4);
			if (this.aBoolean141) {
				local257.glClientActiveTexture(Static128.method2102());
				this.aByteBuffer4.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer4);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass62_1.method1659();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static298.aBoolean357) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean141) {
				local257.glClientActiveTexture(Static128.method2102());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static178.aBoolean225) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static91.aClass4_Sub17_2.anInt2400 != 0) {
			if (Static91.aByteBuffer2 == null || Static91.aByteBuffer2.capacity() < Static91.aClass4_Sub17_2.anInt2400) {
				Static91.aByteBuffer2 = ByteBuffer.allocateDirect(Static91.aClass4_Sub17_2.anInt2400).order(ByteOrder.nativeOrder());
			} else {
				Static91.aByteBuffer2.clear();
			}
			Static91.aByteBuffer2.put(Static91.aClass4_Sub17_2.aByteArray30, 0, Static91.aClass4_Sub17_2.anInt2400);
			Static91.aByteBuffer2.flip();
			Static178.method2771(arg1);
			local257.glDrawElements(4, Static91.aClass4_Sub17_2.anInt2400 / 4, 5125, Static91.aByteBuffer2);
		}
		if (Static91.aClass4_Sub17_3.anInt2400 == 0) {
			return;
		}
		if (Static91.aByteBuffer3 == null || Static91.aByteBuffer3.capacity() < Static91.aClass4_Sub17_3.anInt2400) {
			Static91.aByteBuffer3 = ByteBuffer.allocateDirect(Static91.aClass4_Sub17_3.anInt2400).order(ByteOrder.nativeOrder());
		} else {
			Static91.aByteBuffer3.clear();
		}
		Static91.aByteBuffer3.put(Static91.aClass4_Sub17_3.aByteArray30, 0, Static91.aClass4_Sub17_3.anInt2400);
		Static91.aByteBuffer3.flip();
		Static178.method2771(arg1 - 100.0F);
		Static178.method2784();
		local257.glDrawElements(4, Static91.aClass4_Sub17_3.anInt2400 / 4, 5125, Static91.aByteBuffer3);
		Static178.method2748();
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
	public void method1456() {
		this.anIntArray201 = new int[this.anInt1877];
		this.anIntArray202 = new int[this.anInt1877];
		this.anIntArray197 = new int[this.anInt1877];
		if (this.aBoolean141) {
			this.aFloatArray12 = new float[this.anInt1877];
		}
		this.anIntArray203 = new int[this.anInt1877];
		this.aFloatArray13 = new float[this.anInt1877];
		this.aFloatArray11 = new float[this.anInt1877];
		this.aFloatArray10 = new float[this.anInt1877];
		this.anIntArray198 = new int[this.anInt1880];
		this.anIntArray200 = new int[this.anInt1880];
		this.anIntArray199 = new int[this.anInt1880];
		this.anIntArrayArray19 = new int[this.anInt1880][];
		this.aClass97_7 = new Class97(Static74.method1127(this.anInt1877));
		if (this.aBoolean140) {
			this.anIntArrayArray18 = new int[this.anInt1880][];
			this.aBooleanArray14 = new boolean[this.anInt1880];
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIFFFIF)I")
	public int method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class4_Sub19 local28 = (Class4_Sub19) this.aClass97_7.method2360(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray202[local28.anInt2869]) {
					this.anIntArray202[local28.anInt2869] = arg1;
				}
				return local28.anInt2869;
			}
		}
		this.anIntArray201[this.anInt1873] = arg0;
		this.anIntArray202[this.anInt1873] = arg1;
		this.anIntArray197[this.anInt1873] = arg2;
		if (this.aBoolean141) {
			this.aFloatArray12[this.anInt1873] = arg7;
		}
		this.aFloatArray13[this.anInt1873] = arg3;
		this.aFloatArray11[this.anInt1873] = arg4;
		this.aFloatArray10[this.anInt1873] = arg5;
		this.anIntArray203[this.anInt1873] = arg6;
		if (local1 != 0L) {
			this.aClass97_7.method2364(new Class4_Sub19(this.anInt1873), local1);
		}
		return this.anInt1873++;
	}
}
