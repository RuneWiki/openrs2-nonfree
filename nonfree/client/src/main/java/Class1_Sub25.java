import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "[Z")
	private boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
	private int[] anIntArray540;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Lclient!cd;")
	private Class22 aClass22_16;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "[I")
	private int[] anIntArray542;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "[I")
	private int[] anIntArray543;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Lclient!fd;")
	private Class52 aClass52_7;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	public int anInt4711 = 0;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public int anInt4714 = 0;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	public int anInt4713 = 0;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
	private int anInt4716 = 0;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	private int anInt4712 = 0;

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
	private int anInt4717 = 0;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public int anInt4710;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public int anInt4715;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IFZZI)V")
	public Class1_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt4710 = arg0;
		this.aFloat131 = arg1;
		this.aBoolean352 = arg2;
		this.aBoolean351 = arg3;
		this.anInt4715 = arg4;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "()V")
	public void method3600() {
		this.anIntArray540 = new int[this.anInt4714];
		this.anIntArray542 = new int[this.anInt4714];
		this.anIntArray538 = new int[this.anInt4714];
		if (this.aBoolean351) {
			this.aFloatArray29 = new float[this.anInt4714];
		}
		this.anIntArray543 = new int[this.anInt4714];
		this.aFloatArray28 = new float[this.anInt4714];
		this.aFloatArray26 = new float[this.anInt4714];
		this.aFloatArray27 = new float[this.anInt4714];
		this.anIntArray539 = new int[this.anInt4713];
		this.anIntArray537 = new int[this.anInt4713];
		this.anIntArray541 = new int[this.anInt4713];
		this.anIntArrayArray36 = new int[this.anInt4713][];
		this.aClass22_16 = new Class22(Static182.method2762(this.anInt4714));
		if (this.aBoolean352) {
			this.anIntArrayArray35 = new int[this.anInt4713][];
			this.aBooleanArray20 = new boolean[this.anInt4713];
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[I[IZ)I")
	public int method3601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean352) {
			this.anIntArrayArray35[this.anInt4716] = arg4;
			this.aBooleanArray20[this.anInt4716] = arg5;
			if (arg4 != null) {
				this.anInt4717 += arg4.length;
			}
			if (arg5) {
				this.anInt4717 += (arg3.length - 2) * 3;
			} else {
				this.anInt4712 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt4712 += (arg3.length - 2) * 3;
		}
		this.anIntArray541[this.anInt4716] = arg0;
		this.anIntArray539[this.anInt4716] = arg1;
		this.anIntArray537[this.anInt4716] = arg2;
		this.anIntArrayArray36[this.anInt4716] = arg3;
		return this.anInt4716++;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIFFFIF)I")
	public int method3602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class1_Sub30 local28 = (Class1_Sub30) this.aClass22_16.method633(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray542[local28.anInt5344]) {
					this.anIntArray542[local28.anInt5344] = arg1;
				}
				return local28.anInt5344;
			}
		}
		this.anIntArray540[this.anInt4711] = arg0;
		this.anIntArray542[this.anInt4711] = arg1;
		this.anIntArray538[this.anInt4711] = arg2;
		if (this.aBoolean351) {
			this.aFloatArray29[this.anInt4711] = arg7;
		}
		this.aFloatArray28[this.anInt4711] = arg3;
		this.aFloatArray26[this.anInt4711] = arg4;
		this.aFloatArray27[this.anInt4711] = arg5;
		this.anIntArray543[this.anInt4711] = arg6;
		if (local1 != 0L) {
			this.aClass22_16.method643(local1, new Class1_Sub30(this.anInt4711));
		}
		return this.anInt4711++;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([[[Lclient!kb;FZ)V")
	public void method3603(@OriginalArg(0) Class1_Sub19[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static225.aClass1_Sub18_6 == null || Static225.aClass1_Sub18_6.aByteArray71.length < this.anInt4712 * 4) {
			Static225.aClass1_Sub18_6 = new Class1_Sub18(this.anInt4712 * 4);
		} else {
			Static225.aClass1_Sub18_6.anInt3911 = 0;
		}
		if (Static225.aClass1_Sub18_5 == null || Static225.aClass1_Sub18_5.aByteArray71.length < this.anInt4717 * 4) {
			Static225.aClass1_Sub18_5 = new Class1_Sub18(this.anInt4717 * 4);
		} else {
			Static225.aClass1_Sub18_5.anInt3911 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class1_Sub19 local68;
		@Pc(111) Class1_Sub18 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static240.aBoolean379) {
			for (local47 = 0; local47 < this.anInt4716; local47++) {
				local68 = arg0[this.anIntArray541[local47]][this.anIntArray539[local47]][this.anIntArray537[local47]];
				if (local68 != null && local68.aBoolean180) {
					local78 = this.anIntArrayArray36[local47];
					if (this.aBoolean352) {
						local86 = this.anIntArrayArray35[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static225.aClass1_Sub18_5.method3119(local86[local90]);
							}
						}
						local111 = this.aBooleanArray20[local47] ? Static225.aClass1_Sub18_5 : Static225.aClass1_Sub18_6;
					} else {
						local111 = Static225.aClass1_Sub18_6;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method3119(local78[0]);
						local111.method3119(local78[local116]);
						local111.method3119(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt4716; local47++) {
				local68 = arg0[this.anIntArray541[local47]][this.anIntArray539[local47]][this.anIntArray537[local47]];
				if (local68 != null && local68.aBoolean180) {
					local78 = this.anIntArrayArray36[local47];
					if (this.aBoolean352) {
						local86 = this.anIntArrayArray35[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static225.aClass1_Sub18_5.method3094(local86[local90]);
							}
						}
						local111 = this.aBooleanArray20[local47] ? Static225.aClass1_Sub18_5 : Static225.aClass1_Sub18_6;
					} else {
						local111 = Static225.aClass1_Sub18_6;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method3094(local78[0]);
						local111.method3094(local78[local116]);
						local111.method3094(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static225.aClass1_Sub18_6.anInt3911 == 0 && Static225.aClass1_Sub18_5.anInt3911 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static240.aGL1;
		if (this.anInt4710 == -1 || arg2) {
			Static240.method3789(-1);
			Static122.method1910(0, 0);
		} else {
			Static208.anInterface4_1.method982(this.anInt4710);
		}
		@Pc(282) int local282 = this.aBoolean351 ? 40 : 36;
		if (this.aClass52_7 == null) {
			if (Static240.aBoolean372) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer14.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer14);
			this.aByteBuffer14.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer14);
			if (Static294.aBoolean445) {
				this.aByteBuffer14.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer14);
			}
			this.aByteBuffer14.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer14);
			if (this.aBoolean351) {
				local257.glClientActiveTexture(Static161.method2490());
				this.aByteBuffer14.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer14);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass52_7.method1197();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static294.aBoolean445) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean351) {
				local257.glClientActiveTexture(Static161.method2490());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static240.aBoolean372) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static225.aClass1_Sub18_6.anInt3911 != 0) {
			if (Static225.aByteBuffer12 == null || Static225.aByteBuffer12.capacity() < Static225.aClass1_Sub18_6.anInt3911) {
				Static225.aByteBuffer12 = ByteBuffer.allocateDirect(Static225.aClass1_Sub18_6.anInt3911).order(ByteOrder.nativeOrder());
			} else {
				Static225.aByteBuffer12.clear();
			}
			Static225.aByteBuffer12.put(Static225.aClass1_Sub18_6.aByteArray71, 0, Static225.aClass1_Sub18_6.anInt3911);
			Static225.aByteBuffer12.flip();
			Static240.method3809(arg1);
			local257.glDrawElements(4, Static225.aClass1_Sub18_6.anInt3911 / 4, 5125, Static225.aByteBuffer12);
		}
		if (Static225.aClass1_Sub18_5.anInt3911 == 0) {
			return;
		}
		if (Static225.aByteBuffer13 == null || Static225.aByteBuffer13.capacity() < Static225.aClass1_Sub18_5.anInt3911) {
			Static225.aByteBuffer13 = ByteBuffer.allocateDirect(Static225.aClass1_Sub18_5.anInt3911).order(ByteOrder.nativeOrder());
		} else {
			Static225.aByteBuffer13.clear();
		}
		Static225.aByteBuffer13.put(Static225.aClass1_Sub18_5.aByteArray71, 0, Static225.aClass1_Sub18_5.anInt3911);
		Static225.aByteBuffer13.flip();
		Static240.method3809(arg1 - 100.0F);
		Static240.method3800();
		local257.glDrawElements(4, Static225.aClass1_Sub18_5.anInt3911 / 4, 5125, Static225.aByteBuffer13);
		Static240.method3808();
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()V")
	public void method3604() {
		@Pc(12) Class1_Sub18 local12 = new Class1_Sub18((this.aBoolean351 ? 40 : 36) * this.anInt4711);
		for (@Pc(14) int local14 = 0; local14 < this.anInt4711; local14++) {
			if (Static240.aBoolean379) {
				local12.method3066((float) this.anIntArray540[local14]);
				local12.method3066((float) this.anIntArray542[local14]);
				local12.method3066((float) this.anIntArray538[local14]);
				local12.method3119(this.anIntArray543[local14]);
				local12.method3066(this.aFloatArray28[local14]);
				local12.method3066(this.aFloatArray26[local14]);
				local12.method3066(this.aFloatArray27[local14]);
				local12.method3066((float) this.anIntArray540[local14] / this.aFloat131);
				local12.method3066((float) this.anIntArray538[local14] / this.aFloat131);
				if (this.aBoolean351) {
					local12.method3066(this.aFloatArray29[local14]);
				}
			} else {
				local12.method3088((float) this.anIntArray540[local14]);
				local12.method3088((float) this.anIntArray542[local14]);
				local12.method3088((float) this.anIntArray538[local14]);
				local12.method3119(this.anIntArray543[local14]);
				local12.method3088(this.aFloatArray28[local14]);
				local12.method3088(this.aFloatArray26[local14]);
				local12.method3088(this.aFloatArray27[local14]);
				local12.method3088((float) this.anIntArray540[local14] / this.aFloat131);
				local12.method3088((float) this.anIntArray538[local14] / this.aFloat131);
				if (this.aBoolean351) {
					local12.method3088(this.aFloatArray29[local14]);
				}
			}
		}
		if (Static240.aBoolean372) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray71, 0, local12.anInt3911);
			this.aClass52_7 = new Class52();
			this.aClass52_7.method1195(local200);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local12.anInt3911).order(ByteOrder.nativeOrder());
			this.aByteBuffer14.put(local12.aByteArray71, 0, local12.anInt3911);
			this.aByteBuffer14.flip();
		}
		this.anIntArray540 = null;
		this.anIntArray542 = null;
		this.anIntArray538 = null;
		this.anIntArray543 = null;
		this.aFloatArray28 = null;
		this.aFloatArray26 = null;
		this.aFloatArray27 = null;
		this.aClass22_16 = null;
		this.aFloatArray29 = null;
	}
}
