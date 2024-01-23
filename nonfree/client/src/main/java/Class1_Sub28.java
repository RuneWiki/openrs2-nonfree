import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[Z")
	private boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[I")
	private int[] anIntArray494;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
	private int[] anIntArray495;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "[I")
	private int[] anIntArray496;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Lclient!vl;")
	private Class186 aClass186_25;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "[I")
	private int[] anIntArray497;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "Lclient!bk;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	private int anInt5504 = 0;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	public int anInt5505 = 0;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
	private int anInt5508 = 0;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
	private int anInt5507 = 0;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	public int anInt5510 = 0;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
	public int anInt5506 = 0;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
	public int anInt5509;

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
	public boolean aBoolean346;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "Z")
	private boolean aBoolean347;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IFZZI)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt5509 = arg0;
		this.aFloat53 = arg1;
		this.aBoolean346 = arg2;
		this.aBoolean347 = arg3;
		this.anInt5511 = arg4;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	public void method4168() {
		this.anIntArray496 = new int[this.anInt5506];
		this.anIntArray498 = new int[this.anInt5506];
		this.anIntArray499 = new int[this.anInt5506];
		if (this.aBoolean347) {
			this.aFloatArray29 = new float[this.anInt5506];
		}
		this.anIntArray495 = new int[this.anInt5506];
		this.aFloatArray27 = new float[this.anInt5506];
		this.aFloatArray26 = new float[this.anInt5506];
		this.aFloatArray28 = new float[this.anInt5506];
		this.anIntArray500 = new int[this.anInt5510];
		this.anIntArray494 = new int[this.anInt5510];
		this.anIntArray497 = new int[this.anInt5510];
		this.anIntArrayArray71 = new int[this.anInt5510][];
		this.aClass186_25 = new Class186(Static315.method4766(this.anInt5506));
		if (this.aBoolean346) {
			this.anIntArrayArray70 = new int[this.anInt5510][];
			this.aBooleanArray25 = new boolean[this.anInt5510];
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
	public void method4169() {
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14((this.aBoolean347 ? 40 : 36) * this.anInt5505);
		for (@Pc(14) int local14 = 0; local14 < this.anInt5505; local14++) {
			if (Static294.aBoolean377) {
				local12.method2192((float) this.anIntArray496[local14]);
				local12.method2192((float) this.anIntArray498[local14]);
				local12.method2192((float) this.anIntArray499[local14]);
				local12.method2236(this.anIntArray495[local14]);
				local12.method2192(this.aFloatArray27[local14]);
				local12.method2192(this.aFloatArray26[local14]);
				local12.method2192(this.aFloatArray28[local14]);
				local12.method2192((float) this.anIntArray496[local14] / this.aFloat53);
				local12.method2192((float) this.anIntArray499[local14] / this.aFloat53);
				if (this.aBoolean347) {
					local12.method2192(this.aFloatArray29[local14]);
				}
			} else {
				local12.method2217((float) this.anIntArray496[local14]);
				local12.method2217((float) this.anIntArray498[local14]);
				local12.method2217((float) this.anIntArray499[local14]);
				local12.method2236(this.anIntArray495[local14]);
				local12.method2217(this.aFloatArray27[local14]);
				local12.method2217(this.aFloatArray26[local14]);
				local12.method2217(this.aFloatArray28[local14]);
				local12.method2217((float) this.anIntArray496[local14] / this.aFloat53);
				local12.method2217((float) this.anIntArray499[local14] / this.aFloat53);
				if (this.aBoolean347) {
					local12.method2217(this.aFloatArray29[local14]);
				}
			}
		}
		if (Static294.aBoolean381) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray55, 0, local12.anInt3000);
			this.aClass21_5 = new Class21();
			this.aClass21_5.method436(local200);
		} else {
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local12.anInt3000).order(ByteOrder.nativeOrder());
			this.aByteBuffer13.put(local12.aByteArray55, 0, local12.anInt3000);
			this.aByteBuffer13.flip();
		}
		this.anIntArray496 = null;
		this.anIntArray498 = null;
		this.anIntArray499 = null;
		this.anIntArray495 = null;
		this.aFloatArray27 = null;
		this.aFloatArray26 = null;
		this.aFloatArray28 = null;
		this.aClass186_25 = null;
		this.aFloatArray29 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIFFFIF)I")
	public int method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class1_Sub17 local28 = (Class1_Sub17) this.aClass186_25.method4570(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray498[local28.anInt3669]) {
					this.anIntArray498[local28.anInt3669] = arg1;
				}
				return local28.anInt3669;
			}
		}
		this.anIntArray496[this.anInt5505] = arg0;
		this.anIntArray498[this.anInt5505] = arg1;
		this.anIntArray499[this.anInt5505] = arg2;
		if (this.aBoolean347) {
			this.aFloatArray29[this.anInt5505] = arg7;
		}
		this.aFloatArray27[this.anInt5505] = arg3;
		this.aFloatArray26[this.anInt5505] = arg4;
		this.aFloatArray28[this.anInt5505] = arg5;
		this.anIntArray495[this.anInt5505] = arg6;
		if (local1 != 0L) {
			this.aClass186_25.method4575(local1, new Class1_Sub17(this.anInt5505));
		}
		return this.anInt5505++;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([[[Lclient!aa;FZ)V")
	public void method4172(@OriginalArg(0) Class1_Sub2[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static276.aClass1_Sub14_9 == null || Static276.aClass1_Sub14_9.aByteArray55.length < this.anInt5508 * 4) {
			Static276.aClass1_Sub14_9 = new Class1_Sub14(this.anInt5508 * 4);
		} else {
			Static276.aClass1_Sub14_9.anInt3000 = 0;
		}
		if (Static276.aClass1_Sub14_10 == null || Static276.aClass1_Sub14_10.aByteArray55.length < this.anInt5507 * 4) {
			Static276.aClass1_Sub14_10 = new Class1_Sub14(this.anInt5507 * 4);
		} else {
			Static276.aClass1_Sub14_10.anInt3000 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class1_Sub2 local68;
		@Pc(111) Class1_Sub14 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static294.aBoolean377) {
			for (local47 = 0; local47 < this.anInt5504; local47++) {
				local68 = arg0[this.anIntArray497[local47]][this.anIntArray500[local47]][this.anIntArray494[local47]];
				if (local68 != null && local68.aBoolean4) {
					local78 = this.anIntArrayArray71[local47];
					if (this.aBoolean346) {
						local86 = this.anIntArrayArray70[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static276.aClass1_Sub14_10.method2236(local86[local90]);
							}
						}
						local111 = this.aBooleanArray25[local47] ? Static276.aClass1_Sub14_10 : Static276.aClass1_Sub14_9;
					} else {
						local111 = Static276.aClass1_Sub14_9;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2236(local78[0]);
						local111.method2236(local78[local116]);
						local111.method2236(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt5504; local47++) {
				local68 = arg0[this.anIntArray497[local47]][this.anIntArray500[local47]][this.anIntArray494[local47]];
				if (local68 != null && local68.aBoolean4) {
					local78 = this.anIntArrayArray71[local47];
					if (this.aBoolean346) {
						local86 = this.anIntArrayArray70[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static276.aClass1_Sub14_10.method2233(local86[local90]);
							}
						}
						local111 = this.aBooleanArray25[local47] ? Static276.aClass1_Sub14_10 : Static276.aClass1_Sub14_9;
					} else {
						local111 = Static276.aClass1_Sub14_9;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2233(local78[0]);
						local111.method2233(local78[local116]);
						local111.method2233(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static276.aClass1_Sub14_9.anInt3000 == 0 && Static276.aClass1_Sub14_10.anInt3000 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static294.aGL1;
		if (this.anInt5509 == -1 || arg2) {
			Static294.method4486(-1);
			Static1.method4721(0, 0);
		} else {
			Static237.anInterface1_1.method4595(this.anInt5509);
		}
		@Pc(282) int local282 = this.aBoolean347 ? 40 : 36;
		if (this.aClass21_5 == null) {
			if (Static294.aBoolean381) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer13.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer13);
			this.aByteBuffer13.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer13);
			if (Static65.aBoolean96) {
				this.aByteBuffer13.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer13);
			}
			this.aByteBuffer13.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer13);
			if (this.aBoolean347) {
				local257.glClientActiveTexture(Static239.method3770());
				this.aByteBuffer13.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer13);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass21_5.method437();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static65.aBoolean96) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean347) {
				local257.glClientActiveTexture(Static239.method3770());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static294.aBoolean381) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static276.aClass1_Sub14_9.anInt3000 != 0) {
			if (Static276.aByteBuffer12 == null || Static276.aByteBuffer12.capacity() < Static276.aClass1_Sub14_9.anInt3000) {
				Static276.aByteBuffer12 = ByteBuffer.allocateDirect(Static276.aClass1_Sub14_9.anInt3000).order(ByteOrder.nativeOrder());
			} else {
				Static276.aByteBuffer12.clear();
			}
			Static276.aByteBuffer12.put(Static276.aClass1_Sub14_9.aByteArray55, 0, Static276.aClass1_Sub14_9.anInt3000);
			Static276.aByteBuffer12.flip();
			Static294.method4511(arg1);
			local257.glDrawElements(4, Static276.aClass1_Sub14_9.anInt3000 / 4, 5125, Static276.aByteBuffer12);
		}
		if (Static276.aClass1_Sub14_10.anInt3000 == 0) {
			return;
		}
		if (Static276.aByteBuffer11 == null || Static276.aByteBuffer11.capacity() < Static276.aClass1_Sub14_10.anInt3000) {
			Static276.aByteBuffer11 = ByteBuffer.allocateDirect(Static276.aClass1_Sub14_10.anInt3000).order(ByteOrder.nativeOrder());
		} else {
			Static276.aByteBuffer11.clear();
		}
		Static276.aByteBuffer11.put(Static276.aClass1_Sub14_10.aByteArray55, 0, Static276.aClass1_Sub14_10.anInt3000);
		Static276.aByteBuffer11.flip();
		Static294.method4511(arg1 - 100.0F);
		Static294.method4492();
		local257.glDrawElements(4, Static276.aClass1_Sub14_10.anInt3000 / 4, 5125, Static276.aByteBuffer11);
		Static294.method4495();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III[I[IZ)I")
	public int method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean346) {
			this.anIntArrayArray70[this.anInt5504] = arg4;
			this.aBooleanArray25[this.anInt5504] = arg5;
			if (arg4 != null) {
				this.anInt5507 += arg4.length;
			}
			if (arg5) {
				this.anInt5507 += (arg3.length - 2) * 3;
			} else {
				this.anInt5508 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt5508 += (arg3.length - 2) * 3;
		}
		this.anIntArray497[this.anInt5504] = arg0;
		this.anIntArray500[this.anInt5504] = arg1;
		this.anIntArray494[this.anInt5504] = arg2;
		this.anIntArrayArray71[this.anInt5504] = arg3;
		return this.anInt5504++;
	}
}
