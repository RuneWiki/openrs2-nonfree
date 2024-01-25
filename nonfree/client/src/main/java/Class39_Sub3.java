import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Z")
	private final boolean aBoolean136;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!ica;")
	private Class156 aClass156_4;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!ica;")
	private Class156 aClass156_3;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!ica;")
	private Class156 aClass156_1;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!ica;")
	private Class156 aClass156_2;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!wo;")
	private Class167_Sub3 aClass167_Sub3_1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class39_Sub3(@OriginalArg(0) Class133_Sub3 arg0) {
		super(arg0);
		if (super.aClass133_Sub3_42.aBoolean634) {
			this.aClass156_4 = Static591.method8515(super.aClass133_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass156_3 = Static591.method8515(super.aClass133_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass156_1 = Static591.method8515(super.aClass133_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass156_2 = Static591.method8515(super.aClass133_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass156_1 != null & this.aClass156_3 != null & this.aClass156_4 != null & this.aClass156_2 != null) {
				this.aClass167_Sub3_1 = new Class167_Sub3(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass167_Sub3_1.method7524(false, false);
				this.aBoolean136 = true;
			} else {
				this.aBoolean136 = false;
			}
		} else {
			this.aBoolean136 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		if (arg1 != null) {
			if (this.aBoolean134) {
				super.aClass133_Sub3_42.method7326(0, 5890, 768);
				super.aClass133_Sub3_42.method7347(5890, 0);
				this.aBoolean134 = false;
			}
			super.aClass133_Sub3_42.method7375(arg1);
			super.aClass133_Sub3_42.method7401(arg0);
		} else if (!this.aBoolean134) {
			super.aClass133_Sub3_42.method7375(super.aClass133_Sub3_42.aClass167_Sub3_4);
			super.aClass133_Sub3_42.method7401(1);
			super.aClass133_Sub3_42.method7326(0, 34168, 768);
			super.aClass133_Sub3_42.method7347(34168, 0);
			this.aBoolean134 = true;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public void method1549() {
		if (!this.aBoolean137) {
			return;
		}
		@Pc(6) int local6 = super.aClass133_Sub3_42.XA();
		@Pc(10) int local10 = super.aClass133_Sub3_42.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(31) float local31 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local31, local21, 1.0F / (float) super.aClass133_Sub3_42.anInt8556, (float) super.aClass133_Sub3_42.anInt8552 / 255.0F);
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7344(super.aClass133_Sub3_42.anInt8562);
		super.aClass133_Sub3_42.method7368(0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		if (this.aBoolean137) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean137 = false;
		}
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(null);
		super.aClass133_Sub3_42.method7342(8448, 8448);
		super.aClass133_Sub3_42.method7326(0, 5890, 768);
		super.aClass133_Sub3_42.method7326(2, 34166, 770);
		super.aClass133_Sub3_42.method7347(5890, 0);
		super.aClass133_Sub3_42.method7368(0);
		if (this.aBoolean134) {
			super.aClass133_Sub3_42.method7326(0, 5890, 768);
			super.aClass133_Sub3_42.method7347(5890, 0);
			this.aBoolean134 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public void method1550() {
		@Pc(15) Class113_Sub2 local15 = super.aClass133_Sub3_42.aClass113_Sub2_4;
		if (this.aBoolean135) {
			OpenGL.glBindProgramARB(34336, ~super.aClass133_Sub3_42.anInt8565 == Integer.MIN_VALUE ? this.aClass156_3.anInt4188 : this.aClass156_2.anInt4188);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass133_Sub3_42.anInt8565 == Integer.MIN_VALUE ? this.aClass156_4.anInt4188 : this.aClass156_1.anInt4188);
		}
		local15.method5678(0.0F, 0.0F, Static571.aFloatArray73, -1.0F, (float) super.aClass133_Sub3_42.anInt8565);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static571.aFloatArray73[0], Static571.aFloatArray73[1], Static571.aFloatArray73[2], Static571.aFloatArray73[3]);
		OpenGL.glEnable(34336);
		this.aBoolean137 = true;
		this.method1549();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return this.aBoolean136;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		this.aBoolean135 = arg0;
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(this.aClass167_Sub3_1);
		super.aClass133_Sub3_42.method7342(7681, 34165);
		super.aClass133_Sub3_42.method7326(0, 34166, 768);
		super.aClass133_Sub3_42.method7326(2, 5890, 770);
		super.aClass133_Sub3_42.method7347(34168, 0);
		super.aClass133_Sub3_42.method7368(0);
		this.method1550();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
