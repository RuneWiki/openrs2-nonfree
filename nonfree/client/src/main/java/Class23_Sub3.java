import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!m;")
	private Class125 aClass125_3;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!m;")
	private Class125 aClass125_2;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!m;")
	private Class125 aClass125_1;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!m;")
	private Class125 aClass125_4;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class23_Sub3(@OriginalArg(0) Class59_Sub1 arg0) {
		super(arg0);
		if (this.aClass59_Sub1_41.aBoolean353) {
			this.aClass125_3 = Static182.method3380(this.aClass59_Sub1_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nATTRIB  iFogDepth    = vertex.texcoord[1];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iFogDepth.x, fogParams.z, 0.5;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iFogDepth.x;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass125_2 = Static182.method3380(this.aClass59_Sub1_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nATTRIB  iFogDepth    = vertex.texcoord[1];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iFogDepth.x, fogParams.z, 0.5;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iFogDepth.x;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   colour, state.lightmodel.ambient;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMIN   ndotl, ndotl, 1;\nMAX   ndotl, ndotl, 0;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass125_1 = Static182.method3380(this.aClass59_Sub1_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, 0.5;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oTexCoord0, iTexCoord;\nEND\n");
			this.aClass125_4 = Static182.method3380(this.aClass59_Sub1_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, 0.5;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   colour, state.lightmodel.ambient;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMIN   ndotl, ndotl, 1;\nMAX   ndotl, ndotl, 0;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oTexCoord0, iTexCoord;\nEND\n");
			this.aBoolean215 = this.aClass125_3 != null & this.aClass125_2 != null & this.aClass125_1 != null & this.aClass125_4 != null;
		} else {
			this.aBoolean215 = false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5767(@OriginalArg(0) boolean arg0) {
		this.aBoolean214 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()Z")
	@Override
	public boolean method5764() {
		return this.aBoolean215;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method5763(@OriginalArg(0) Class11 arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	@Override
	public void method5765(@OriginalArg(0) int arg0) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_41.anOpengl2;
		Static146.aFloatArray14[3] = arg0;
		local3.glTexGenfv(8192, 9474, Static146.aFloatArray14, 0);
		if (this.aBoolean214) {
			if (arg0 == Integer.MAX_VALUE) {
				local3.glBindProgramARB(34336, this.aClass125_2.anInt3668);
			} else {
				local3.glBindProgramARB(34336, this.aClass125_4.anInt3668);
			}
		} else if (arg0 == Integer.MAX_VALUE) {
			local3.glBindProgramARB(34336, this.aClass125_3.anInt3668);
		} else {
			local3.glBindProgramARB(34336, this.aClass125_1.anInt3668);
		}
		local3.glProgramLocalParameter4fARB(34336, 0, (float) (this.aClass59_Sub1_41.anInt4776 - 1280), (float) (this.aClass59_Sub1_41.anInt4776 - 768), 1.0F / (float) this.aClass59_Sub1_41.anInt4775, 0.0F);
		local3.glEnable(34336);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5766(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()V")
	@Override
	public void method5762() {
		this.aClass59_Sub1_41.anOpengl2.glBindProgramARB(34336, 0);
		this.aClass59_Sub1_41.anOpengl2.glDisable(34336);
	}
}
