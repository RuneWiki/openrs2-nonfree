import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class112_Sub4 extends Class112 {

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "Z")
	private boolean aBoolean415 = false;

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "Lclient!cd;")
	private Class56 aClass56_2;

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "Lclient!cd;")
	private Class56 aClass56_3;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "Lclient!cd;")
	private Class56 aClass56_5;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "Lclient!cd;")
	private Class56 aClass56_4;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "Z")
	private final boolean aBoolean413;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "Lclient!ng;")
	private Class64_Sub4 aClass64_Sub4_5;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class112_Sub4(@OriginalArg(0) Class145_Sub3 arg0) {
		super(arg0);
		if (super.aClass145_Sub3_43.aBoolean863) {
			this.aClass56_2 = Static560.method7801("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass145_Sub3_43);
			this.aClass56_3 = Static560.method7801("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass145_Sub3_43);
			this.aClass56_5 = Static560.method7801("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass145_Sub3_43);
			this.aClass56_4 = Static560.method7801("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass145_Sub3_43);
			if (this.aClass56_4 != null & this.aClass56_2 != null & this.aClass56_3 != null & this.aClass56_5 != null) {
				this.aClass64_Sub4_5 = new Class64_Sub4(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass64_Sub4_5.method4548(false, false);
				this.aBoolean413 = true;
			} else {
				this.aBoolean413 = false;
			}
		} else {
			this.aBoolean413 = false;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return this.aBoolean413;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean415) {
				super.aClass145_Sub3_43.method8854(0, 5890, 768);
				super.aClass145_Sub3_43.method8857(5890, 0);
				this.aBoolean415 = false;
			}
			super.aClass145_Sub3_43.method8872(arg0);
			super.aClass145_Sub3_43.method8900(arg1);
		} else if (!this.aBoolean415) {
			super.aClass145_Sub3_43.method8872(super.aClass145_Sub3_43.aClass64_Sub4_6);
			super.aClass145_Sub3_43.method8900(1);
			super.aClass145_Sub3_43.method8854(0, 34168, 768);
			super.aClass145_Sub3_43.method8857(34168, 0);
			this.aBoolean415 = true;
		}
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
	public void method4377() {
		@Pc(7) Class86_Sub1 local7 = super.aClass145_Sub3_43.aClass86_Sub1_4;
		if (this.aBoolean412) {
			OpenGL.glBindProgramARB(34336, super.aClass145_Sub3_43.anInt10159 == Integer.MAX_VALUE ? this.aClass56_3.anInt1316 : this.aClass56_4.anInt1316);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass145_Sub3_43.anInt10159 == Integer.MIN_VALUE ? this.aClass56_2.anInt1316 : this.aClass56_5.anInt1316);
		}
		local7.method1809(Static490.aFloatArray56, -1.0F, 0.0F, (float) super.aClass145_Sub3_43.anInt10159, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static490.aFloatArray56[0], Static490.aFloatArray56[1], Static490.aFloatArray56[2], Static490.aFloatArray56[3]);
		OpenGL.glEnable(34336);
		this.aBoolean414 = true;
		this.method4378();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		this.aBoolean412 = arg0;
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8872(this.aClass64_Sub4_5);
		super.aClass145_Sub3_43.method8897(7681, 34165);
		super.aClass145_Sub3_43.method8854(0, 34166, 768);
		super.aClass145_Sub3_43.method8854(2, 5890, 770);
		super.aClass145_Sub3_43.method8857(34168, 0);
		super.aClass145_Sub3_43.method8859(0);
		this.method4377();
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V")
	public void method4378() {
		if (!this.aBoolean414) {
			return;
		}
		@Pc(14) int local14 = super.aClass145_Sub3_43.XA();
		@Pc(18) int local18 = super.aClass145_Sub3_43.i();
		@Pc(29) float local29 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(40) float local40 = (float) local14 - (float) (local14 - local18) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, local29, 1.0F / (float) super.aClass145_Sub3_43.anInt10184, (float) super.aClass145_Sub3_43.anInt10174 / 255.0F);
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8912(super.aClass145_Sub3_43.anInt10186);
		super.aClass145_Sub3_43.method8859(0);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		if (this.aBoolean414) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean414 = false;
		}
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8872((Class64) null);
		super.aClass145_Sub3_43.method8897(8448, 8448);
		super.aClass145_Sub3_43.method8854(0, 5890, 768);
		super.aClass145_Sub3_43.method8854(2, 34166, 770);
		super.aClass145_Sub3_43.method8857(5890, 0);
		super.aClass145_Sub3_43.method8859(0);
		if (this.aBoolean415) {
			super.aClass145_Sub3_43.method8854(0, 5890, 768);
			super.aClass145_Sub3_43.method8857(5890, 0);
			this.aBoolean415 = false;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
	}
}
