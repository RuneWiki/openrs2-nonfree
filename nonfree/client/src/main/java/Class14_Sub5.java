import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Z")
	private boolean aBoolean441;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Z")
	private boolean aBoolean442;

	@OriginalMember(owner = "client!hs", name = "B", descriptor = "Z")
	private boolean aBoolean443 = false;

	@OriginalMember(owner = "client!hs", name = "C", descriptor = "Lclient!kn;")
	private Class186 aClass186_4;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "Lclient!kn;")
	private Class186 aClass186_5;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Lclient!kn;")
	private Class186 aClass186_2;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!kn;")
	private Class186 aClass186_3;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "Lclient!hga;")
	private Class121_Sub2 aClass121_Sub2_4;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class14_Sub5(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
		if (super.aClass33_Sub3_43.aBoolean274) {
			this.aClass186_4 = Static67.method1488("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass33_Sub3_43);
			this.aClass186_5 = Static67.method1488("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass33_Sub3_43);
			this.aClass186_2 = Static67.method1488("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass33_Sub3_43);
			this.aClass186_3 = Static67.method1488("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass33_Sub3_43);
			if (this.aClass186_2 != null & this.aClass186_5 != null & this.aClass186_4 != null & this.aClass186_3 != null) {
				this.aClass121_Sub2_4 = new Class121_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass121_Sub2_4.method5567(false, false);
				this.aBoolean444 = true;
			} else {
				this.aBoolean444 = false;
			}
		} else {
			this.aBoolean444 = false;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean443) {
				super.aClass33_Sub3_43.method3024(768, 5890, 0);
				super.aClass33_Sub3_43.method3081(5890, 0);
				this.aBoolean443 = false;
			}
			super.aClass33_Sub3_43.method3012(arg0);
			super.aClass33_Sub3_43.method3045(arg1);
		} else if (!this.aBoolean443) {
			super.aClass33_Sub3_43.method3012(super.aClass33_Sub3_43.aClass121_Sub2_1);
			super.aClass33_Sub3_43.method3045(1);
			super.aClass33_Sub3_43.method3024(768, 34168, 0);
			super.aClass33_Sub3_43.method3081(34168, 0);
			this.aBoolean443 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
	public void method4264() {
		@Pc(7) Class47_Sub2 local7 = super.aClass33_Sub3_43.aClass47_Sub2_4;
		if (this.aBoolean441) {
			OpenGL.glBindProgramARB(34336, super.aClass33_Sub3_43.anInt3438 == Integer.MAX_VALUE ? this.aClass186_5.anInt6029 : this.aClass186_3.anInt6029);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass33_Sub3_43.anInt3438 == Integer.MAX_VALUE ? this.aClass186_4.anInt6029 : this.aClass186_2.anInt6029);
		}
		local7.method3501(Static520.aFloatArray66, 0.0F, 0.0F, (float) super.aClass33_Sub3_43.anInt3438, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static520.aFloatArray66[0], Static520.aFloatArray66[1], Static520.aFloatArray66[2], Static520.aFloatArray66[3]);
		OpenGL.glEnable(34336);
		this.aBoolean442 = true;
		this.method4265();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		this.aBoolean441 = arg0;
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(this.aClass121_Sub2_4);
		super.aClass33_Sub3_43.method3057(7681, 34165);
		super.aClass33_Sub3_43.method3024(768, 34166, 0);
		super.aClass33_Sub3_43.method3024(770, 5890, 2);
		super.aClass33_Sub3_43.method3081(34168, 0);
		super.aClass33_Sub3_43.method3027(0);
		this.method4264();
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	public void method4265() {
		if (!this.aBoolean442) {
			return;
		}
		@Pc(6) int local6 = super.aClass33_Sub3_43.XA();
		@Pc(10) int local10 = super.aClass33_Sub3_43.i();
		@Pc(20) float local20 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(31) float local31 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local31, local20, 1.0F / (float) super.aClass33_Sub3_43.anInt3451, (float) super.aClass33_Sub3_43.anInt3459 / 255.0F);
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3010(super.aClass33_Sub3_43.anInt3455);
		super.aClass33_Sub3_43.method3027(0);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		if (this.aBoolean442) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean442 = false;
		}
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(null);
		super.aClass33_Sub3_43.method3057(8448, 8448);
		super.aClass33_Sub3_43.method3024(768, 5890, 0);
		super.aClass33_Sub3_43.method3024(770, 34166, 2);
		super.aClass33_Sub3_43.method3081(5890, 0);
		super.aClass33_Sub3_43.method3027(0);
		if (this.aBoolean443) {
			super.aClass33_Sub3_43.method3024(768, 5890, 0);
			super.aClass33_Sub3_43.method3081(5890, 0);
			this.aBoolean443 = false;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return this.aBoolean444;
	}
}
