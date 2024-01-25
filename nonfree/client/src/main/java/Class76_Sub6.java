import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class76_Sub6 extends Class76 {

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "Z")
	private boolean aBoolean672;

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "Z")
	private boolean aBoolean673;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Z")
	private final boolean aBoolean671;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!jea;")
	private Class169 aClass169_1;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Lclient!jea;")
	private Class169 aClass169_3;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Lclient!jea;")
	private Class169 aClass169_2;

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "Lclient!jea;")
	private Class169 aClass169_4;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Lclient!wn;")
	private Class40_Sub3 aClass40_Sub3_5;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class76_Sub6(@OriginalArg(0) Class134_Sub2 arg0) {
		super(arg0);
		if (super.aClass134_Sub2_43.aBoolean511) {
			this.aClass169_1 = Static483.method6531(super.aClass134_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass169_3 = Static483.method6531(super.aClass134_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass169_2 = Static483.method6531(super.aClass134_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass169_4 = Static483.method6531(super.aClass134_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass169_4 != null & this.aClass169_2 != null & this.aClass169_3 != null & this.aClass169_1 != null) {
				this.aClass40_Sub3_5 = new Class40_Sub3(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass40_Sub3_5.method5391(false, false);
				this.aBoolean671 = true;
			} else {
				this.aBoolean671 = false;
			}
		} else {
			this.aBoolean671 = false;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		this.aBoolean673 = arg0;
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(this.aClass40_Sub3_5);
		super.aClass134_Sub2_43.method5224(34165, 7681);
		super.aClass134_Sub2_43.method5200(0, 34166, 768);
		super.aClass134_Sub2_43.method5200(2, 5890, 770);
		super.aClass134_Sub2_43.method5271(34168, 0);
		super.aClass134_Sub2_43.method5197(0);
		this.method7065();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		if (this.aBoolean672) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean672 = false;
		}
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(null);
		super.aClass134_Sub2_43.method5224(8448, 8448);
		super.aClass134_Sub2_43.method5200(0, 5890, 768);
		super.aClass134_Sub2_43.method5200(2, 34166, 770);
		super.aClass134_Sub2_43.method5271(5890, 0);
		super.aClass134_Sub2_43.method5197(0);
		super.aClass134_Sub2_43.method5200(0, 5890, 768);
		super.aClass134_Sub2_43.method5271(5890, 0);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	public void method7061() {
		if (!this.aBoolean672) {
			return;
		}
		@Pc(6) int local6 = super.aClass134_Sub2_43.U();
		@Pc(10) int local10 = super.aClass134_Sub2_43.BA();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(33) float local33 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local33, local22, 1.0F / (float) super.aClass134_Sub2_43.anInt6594, (float) super.aClass134_Sub2_43.anInt6584 / 255.0F);
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5217(super.aClass134_Sub2_43.anInt6578);
		super.aClass134_Sub2_43.method5197(0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return this.aBoolean671;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		if (arg1 == null) {
			super.aClass134_Sub2_43.method5202(super.aClass134_Sub2_43.aClass40_Sub3_4);
			super.aClass134_Sub2_43.method5194(1);
			super.aClass134_Sub2_43.method5200(0, 34168, 768);
			super.aClass134_Sub2_43.method5271(34168, 0);
		} else {
			super.aClass134_Sub2_43.method5202(arg1);
			super.aClass134_Sub2_43.method5194(arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public void method7065() {
		@Pc(7) Class113_Sub2 local7 = super.aClass134_Sub2_43.aClass113_Sub2_4;
		if (this.aBoolean673) {
			OpenGL.glBindProgramARB(34336, super.aClass134_Sub2_43.anInt6570 == Integer.MAX_VALUE ? this.aClass169_3.anInt4445 : this.aClass169_4.anInt4445);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass134_Sub2_43.anInt6570 == Integer.MAX_VALUE ? this.aClass169_1.anInt4445 : this.aClass169_2.anInt4445);
		}
		local7.method2602(-1.0F, 0.0F, Static482.aFloatArray46, 0.0F, (float) super.aClass134_Sub2_43.anInt6570);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static482.aFloatArray46[0], Static482.aFloatArray46[1], Static482.aFloatArray46[2], Static482.aFloatArray46[3]);
		OpenGL.glEnable(34336);
		this.aBoolean672 = true;
		this.method7061();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
