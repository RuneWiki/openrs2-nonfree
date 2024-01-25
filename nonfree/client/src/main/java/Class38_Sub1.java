import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!bha", name = "k", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bha", name = "u", descriptor = "Z")
	private final boolean aBoolean54;

	@OriginalMember(owner = "client!bha", name = "B", descriptor = "Lclient!ko;")
	private Class208 aClass208_2;

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "Lclient!ko;")
	private Class208 aClass208_1;

	@OriginalMember(owner = "client!bha", name = "z", descriptor = "Lclient!ko;")
	private Class208 aClass208_3;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "Lclient!ko;")
	private Class208 aClass208_4;

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "Lclient!sb;")
	private Class161_Sub1 aClass161_Sub1_1;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class38_Sub1(@OriginalArg(0) Class144_Sub3 arg0) {
		super(arg0);
		if (super.aClass144_Sub3_43.aBoolean565) {
			this.aClass208_2 = Static335.method5158(super.aClass144_Sub3_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass208_1 = Static335.method5158(super.aClass144_Sub3_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass208_3 = Static335.method5158(super.aClass144_Sub3_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass208_4 = Static335.method5158(super.aClass144_Sub3_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass208_2 != null & this.aClass208_1 != null & this.aClass208_3 != null & this.aClass208_4 != null) {
				this.aClass161_Sub1_1 = new Class161_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass161_Sub1_1.method3971(false, false);
				this.aBoolean54 = true;
			} else {
				this.aBoolean54 = false;
			}
		} else {
			this.aBoolean54 = false;
		}
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		this.aBoolean52 = arg0;
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method6982(this.aClass161_Sub1_1);
		super.aClass144_Sub3_43.method7025(34165, 7681);
		super.aClass144_Sub3_43.method6979(0, 768, 34166);
		super.aClass144_Sub3_43.method6979(2, 770, 5890);
		super.aClass144_Sub3_43.method7021(34168, 0);
		super.aClass144_Sub3_43.method7028(0);
		this.method712();
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean53) {
				super.aClass144_Sub3_43.method6979(0, 768, 5890);
				super.aClass144_Sub3_43.method7021(5890, 0);
				this.aBoolean53 = false;
			}
			super.aClass144_Sub3_43.method6982(arg0);
			super.aClass144_Sub3_43.method6988(arg1);
		} else if (!this.aBoolean53) {
			super.aClass144_Sub3_43.method6982(super.aClass144_Sub3_43.aClass161_Sub1_5);
			super.aClass144_Sub3_43.method6988(1);
			super.aClass144_Sub3_43.method6979(0, 768, 34168);
			super.aClass144_Sub3_43.method7021(34168, 0);
			this.aBoolean53 = true;
		}
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		if (this.aBoolean51) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean51 = false;
		}
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method6982((Class161) null);
		super.aClass144_Sub3_43.method7025(8448, 8448);
		super.aClass144_Sub3_43.method6979(0, 768, 5890);
		super.aClass144_Sub3_43.method6979(2, 770, 34166);
		super.aClass144_Sub3_43.method7021(5890, 0);
		super.aClass144_Sub3_43.method7028(0);
		if (this.aBoolean53) {
			super.aClass144_Sub3_43.method6979(0, 768, 5890);
			super.aClass144_Sub3_43.method7021(5890, 0);
			this.aBoolean53 = false;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return this.aBoolean54;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)V")
	public void method712() {
		@Pc(7) Class263_Sub1 local7 = super.aClass144_Sub3_43.aClass263_Sub1_4;
		if (this.aBoolean52) {
			OpenGL.glBindProgramARB(34336, ~super.aClass144_Sub3_43.anInt8067 == Integer.MIN_VALUE ? this.aClass208_1.anInt5618 : this.aClass208_4.anInt5618);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass144_Sub3_43.anInt8067 == Integer.MAX_VALUE ? this.aClass208_2.anInt5618 : this.aClass208_3.anInt5618);
		}
		local7.method6423(0.0F, 0.0F, (float) super.aClass144_Sub3_43.anInt8067, -1.0F, Static508.aFloatArray68);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static508.aFloatArray68[0], Static508.aFloatArray68[1], Static508.aFloatArray68[2], Static508.aFloatArray68[3]);
		OpenGL.glEnable(34336);
		this.aBoolean51 = true;
		this.method713();
	}

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)V")
	public void method713() {
		if (!this.aBoolean51) {
			return;
		}
		@Pc(18) int local18 = super.aClass144_Sub3_43.XA();
		@Pc(22) int local22 = super.aClass144_Sub3_43.i();
		@Pc(34) float local34 = -((float) (local18 - local22) * 0.125F) + (float) local18;
		@Pc(46) float local46 = -((float) (local18 - local22) * 0.25F) + (float) local18;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local46, local34, 1.0F / (float) super.aClass144_Sub3_43.anInt8085, (float) super.aClass144_Sub3_43.anInt8071 / 255.0F);
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method7043(super.aClass144_Sub3_43.anInt8076);
		super.aClass144_Sub3_43.method7028(0);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
	}
}
