import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class105_Sub5 extends Class105 {

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "Z")
	private boolean aBoolean451;

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "Lclient!ru;")
	private Class296 aClass296_4;

	@OriginalMember(owner = "client!nca", name = "u", descriptor = "Lclient!ru;")
	private Class296 aClass296_3;

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "Lclient!ru;")
	private Class296 aClass296_1;

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "Lclient!ru;")
	private Class296 aClass296_2;

	@OriginalMember(owner = "client!nca", name = "A", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "Lclient!il;")
	private Class3_Sub2 aClass3_Sub2_5;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class105_Sub5(@OriginalArg(0) Class7_Sub2 arg0) {
		super(arg0);
		if (super.aClass7_Sub2_41.aBoolean378) {
			this.aClass296_4 = Static244.method7174("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass7_Sub2_41);
			this.aClass296_3 = Static244.method7174("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass7_Sub2_41);
			this.aClass296_1 = Static244.method7174("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass7_Sub2_41);
			this.aClass296_2 = Static244.method7174("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass7_Sub2_41);
			if (this.aClass296_4 != null & this.aClass296_3 != null & this.aClass296_1 != null & this.aClass296_2 != null) {
				this.aClass3_Sub2_5 = new Class3_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass3_Sub2_5.method953(false, false);
				this.aBoolean452 = true;
			} else {
				this.aBoolean452 = false;
			}
		} else {
			this.aBoolean452 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
	public void method5242() {
		if (!this.aBoolean451) {
			return;
		}
		@Pc(14) int local14 = super.aClass7_Sub2_41.U();
		@Pc(18) int local18 = super.aClass7_Sub2_41.BA();
		@Pc(30) float local30 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(41) float local41 = (float) local14 - (float) (local14 - local18) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local30, 1.0F / (float) super.aClass7_Sub2_41.anInt5637, (float) super.aClass7_Sub2_41.anInt5617 / 255.0F);
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4315(super.aClass7_Sub2_41.anInt5629);
		super.aClass7_Sub2_41.method4326(0);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		if (this.aBoolean451) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean451 = false;
		}
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(null);
		super.aClass7_Sub2_41.method4346(8448, 8448);
		super.aClass7_Sub2_41.method4280(5890, 0, 768);
		super.aClass7_Sub2_41.method4280(34166, 2, 770);
		super.aClass7_Sub2_41.method4276(5890, 0);
		super.aClass7_Sub2_41.method4326(0);
		super.aClass7_Sub2_41.method4280(5890, 0, 768);
		super.aClass7_Sub2_41.method4276(5890, 0);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1 == null) {
			super.aClass7_Sub2_41.method4313(super.aClass7_Sub2_41.aClass3_Sub2_2);
			super.aClass7_Sub2_41.method4288(1);
			super.aClass7_Sub2_41.method4280(34168, 0, 768);
			super.aClass7_Sub2_41.method4276(34168, 0);
		} else {
			super.aClass7_Sub2_41.method4313(arg1);
			super.aClass7_Sub2_41.method4288(arg0);
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return this.aBoolean452;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
	public void method5244() {
		@Pc(7) Class81_Sub2 local7 = super.aClass7_Sub2_41.bf;
		if (this.aBoolean450) {
			OpenGL.glBindProgramARB(34336, ~super.aClass7_Sub2_41.anInt5634 == Integer.MIN_VALUE ? this.aClass296_3.anInt8883 : this.aClass296_2.anInt8883);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass7_Sub2_41.anInt5634 == Integer.MIN_VALUE ? this.aClass296_4.anInt8883 : this.aClass296_1.anInt8883);
		}
		local7.method3239(Static194.aFloatArray35, (float) super.aClass7_Sub2_41.anInt5634, 0.0F, -1.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static194.aFloatArray35[0], Static194.aFloatArray35[1], Static194.aFloatArray35[2], Static194.aFloatArray35[3]);
		OpenGL.glEnable(34336);
		this.aBoolean451 = true;
		this.method5242();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		this.aBoolean450 = arg0;
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(this.aClass3_Sub2_5);
		super.aClass7_Sub2_41.method4346(34165, 7681);
		super.aClass7_Sub2_41.method4280(34166, 0, 768);
		super.aClass7_Sub2_41.method4280(5890, 2, 770);
		super.aClass7_Sub2_41.method4276(34168, 0);
		super.aClass7_Sub2_41.method4326(0);
		this.method5244();
	}
}
