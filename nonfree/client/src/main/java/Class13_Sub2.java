import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "Lclient!pi;")
	private Class256 aClass256_5;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "Lclient!pi;")
	private Class256 aClass256_3;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "Lclient!pi;")
	private Class256 aClass256_4;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Lclient!pi;")
	private Class256 aClass256_2;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "Lclient!wn;")
	private Class20_Sub4 aClass20_Sub4_1;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class13_Sub2(@OriginalArg(0) Class16_Sub3 arg0) {
		super(arg0);
		if (super.aClass16_Sub3_42.aBoolean516) {
			this.aClass256_5 = Static205.method3781(super.aClass16_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass256_3 = Static205.method3781(super.aClass16_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass256_4 = Static205.method3781(super.aClass16_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass256_2 = Static205.method3781(super.aClass16_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass256_4 != null & this.aClass256_5 != null & this.aClass256_3 != null & this.aClass256_2 != null) {
				this.aClass20_Sub4_1 = new Class20_Sub4(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass20_Sub4_1.method7626(false, false);
				this.aBoolean211 = true;
			} else {
				this.aBoolean211 = false;
			}
		} else {
			this.aBoolean211 = false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public void method2357() {
		@Pc(7) Class54_Sub2 local7 = super.aClass16_Sub3_42.aClass54_Sub2_4;
		if (this.aBoolean212) {
			OpenGL.glBindProgramARB(34336, super.aClass16_Sub3_42.anInt7350 == Integer.MAX_VALUE ? this.aClass256_3.anInt8001 : this.aClass256_2.anInt8001);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass16_Sub3_42.anInt7350 == Integer.MIN_VALUE ? this.aClass256_5.anInt8001 : this.aClass256_4.anInt8001);
		}
		local7.method2600(0.0F, 0.0F, Static38.aFloatArray21, (float) super.aClass16_Sub3_42.anInt7350, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static38.aFloatArray21[0], Static38.aFloatArray21[1], Static38.aFloatArray21[2], Static38.aFloatArray21[3]);
		OpenGL.glEnable(34336);
		this.aBoolean213 = true;
		this.method2360();
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
	public void method2360() {
		if (!this.aBoolean213) {
			return;
		}
		@Pc(10) int local10 = super.aClass16_Sub3_42.XA();
		@Pc(14) int local14 = super.aClass16_Sub3_42.i();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local25, 1.0F / (float) super.aClass16_Sub3_42.anInt7364, (float) super.aClass16_Sub3_42.anInt7380 / 255.0F);
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method5980(super.aClass16_Sub3_42.anInt7378);
		super.aClass16_Sub3_42.method5944(0);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		this.aBoolean212 = arg0;
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method6020(this.aClass20_Sub4_1);
		super.aClass16_Sub3_42.method5957(34165, 7681);
		super.aClass16_Sub3_42.method6025(768, 0, 34166);
		super.aClass16_Sub3_42.method6025(770, 2, 5890);
		super.aClass16_Sub3_42.method6029(0, 34168);
		super.aClass16_Sub3_42.method5944(0);
		this.method2357();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return this.aBoolean211;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (this.aBoolean213) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean213 = false;
		}
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method6020(null);
		super.aClass16_Sub3_42.method5957(8448, 8448);
		super.aClass16_Sub3_42.method6025(768, 0, 5890);
		super.aClass16_Sub3_42.method6025(770, 2, 34166);
		super.aClass16_Sub3_42.method6029(0, 5890);
		super.aClass16_Sub3_42.method5944(0);
		if (this.aBoolean210) {
			super.aClass16_Sub3_42.method6025(768, 0, 5890);
			super.aClass16_Sub3_42.method6029(0, 5890);
			this.aBoolean210 = false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean210) {
				super.aClass16_Sub3_42.method6025(768, 0, 5890);
				super.aClass16_Sub3_42.method6029(0, 5890);
				this.aBoolean210 = false;
			}
			super.aClass16_Sub3_42.method6020(arg0);
			super.aClass16_Sub3_42.method5972(arg1);
		} else if (!this.aBoolean210) {
			super.aClass16_Sub3_42.method6020(super.aClass16_Sub3_42.aClass20_Sub4_5);
			super.aClass16_Sub3_42.method5972(1);
			super.aClass16_Sub3_42.method6025(768, 0, 34168);
			super.aClass16_Sub3_42.method6029(0, 34168);
			this.aBoolean210 = true;
		}
	}
}
