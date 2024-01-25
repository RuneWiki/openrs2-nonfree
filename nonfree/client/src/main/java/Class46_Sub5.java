import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class46_Sub5 extends Class46 {

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Z")
	private boolean aBoolean280;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "Z")
	private final boolean aBoolean281;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "Lclient!vk;")
	private Class351 aClass351_4;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "Lclient!vk;")
	private Class351 aClass351_5;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "Lclient!vk;")
	private Class351 aClass351_3;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!vk;")
	private Class351 aClass351_2;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!g;")
	private Class24_Sub1 aClass24_Sub1_3;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class46_Sub5(@OriginalArg(0) Class45_Sub3 arg0) {
		super(arg0);
		if (super.aClass45_Sub3_40.aBoolean702) {
			this.aClass351_4 = Static138.method2696(super.aClass45_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass351_5 = Static138.method2696(super.aClass45_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass351_3 = Static138.method2696(super.aClass45_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass351_2 = Static138.method2696(super.aClass45_Sub3_40, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass351_2 != null & this.aClass351_3 != null & this.aClass351_4 != null & this.aClass351_5 != null) {
				this.aClass24_Sub1_3 = new Class24_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass24_Sub1_3.method824(false, false);
				this.aBoolean281 = true;
			} else {
				this.aBoolean281 = false;
			}
		} else {
			this.aBoolean281 = false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	public void method3331() {
		@Pc(7) Class11_Sub2 local7 = super.aClass45_Sub3_40.aClass11_Sub2_4;
		if (this.aBoolean280) {
			OpenGL.glBindProgramARB(34336, ~super.aClass45_Sub3_40.anInt9076 == Integer.MIN_VALUE ? this.aClass351_5.anInt9092 : this.aClass351_2.anInt9092);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass45_Sub3_40.anInt9076 == Integer.MAX_VALUE ? this.aClass351_4.anInt9092 : this.aClass351_3.anInt9092);
		}
		local7.method4277((float) super.aClass45_Sub3_40.anInt9076, 0.0F, 0.0F, Static258.aFloatArray80, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static258.aFloatArray80[0], Static258.aFloatArray80[1], Static258.aFloatArray80[2], Static258.aFloatArray80[3]);
		OpenGL.glEnable(34336);
		this.aBoolean279 = true;
		this.method3332();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		this.aBoolean280 = arg0;
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(this.aClass24_Sub1_3);
		super.aClass45_Sub3_40.method7491(34165, 7681);
		super.aClass45_Sub3_40.method7507(768, 34166, 0);
		super.aClass45_Sub3_40.method7507(770, 5890, 2);
		super.aClass45_Sub3_40.method7450(0, 34168);
		super.aClass45_Sub3_40.method7510(0);
		this.method3331();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
	public void method3332() {
		if (!this.aBoolean279) {
			return;
		}
		@Pc(10) int local10 = super.aClass45_Sub3_40.U();
		@Pc(14) int local14 = super.aClass45_Sub3_40.BA();
		@Pc(26) float local26 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local26, 1.0F / (float) super.aClass45_Sub3_40.anInt9058, (float) super.aClass45_Sub3_40.anInt9063 / 255.0F);
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7458(super.aClass45_Sub3_40.anInt9068);
		super.aClass45_Sub3_40.method7510(0);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		if (this.aBoolean279) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean279 = false;
		}
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(null);
		super.aClass45_Sub3_40.method7491(8448, 8448);
		super.aClass45_Sub3_40.method7507(768, 5890, 0);
		super.aClass45_Sub3_40.method7507(770, 34166, 2);
		super.aClass45_Sub3_40.method7450(0, 5890);
		super.aClass45_Sub3_40.method7510(0);
		super.aClass45_Sub3_40.method7507(768, 5890, 0);
		super.aClass45_Sub3_40.method7450(0, 5890);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		if (arg1 == null) {
			super.aClass45_Sub3_40.method7475(super.aClass45_Sub3_40.aClass24_Sub1_6);
			super.aClass45_Sub3_40.method7500(1);
			super.aClass45_Sub3_40.method7507(768, 34168, 0);
			super.aClass45_Sub3_40.method7450(0, 34168);
		} else {
			super.aClass45_Sub3_40.method7475(arg1);
			super.aClass45_Sub3_40.method7500(arg0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}
}
