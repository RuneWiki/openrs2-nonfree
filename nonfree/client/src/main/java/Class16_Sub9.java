import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class16_Sub9 extends Class16 {

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "Z")
	private boolean aBoolean847;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Z")
	private boolean aBoolean849;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Z")
	private boolean aBoolean848 = false;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Lclient!ne;")
	private Class218 aClass218_3;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "Lclient!ne;")
	private Class218 aClass218_5;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "Lclient!ne;")
	private Class218 aClass218_4;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Lclient!ne;")
	private Class218 aClass218_2;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
	private final boolean aBoolean846;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Lclient!aaa;")
	private Class2_Sub1 aClass2_Sub1_6;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class16_Sub9(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
		if (super.aClass5_Sub1_42.aBoolean31) {
			this.aClass218_3 = Static592.method8156(super.aClass5_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass218_5 = Static592.method8156(super.aClass5_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass218_4 = Static592.method8156(super.aClass5_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass218_2 = Static592.method8156(super.aClass5_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass218_2 != null & this.aClass218_4 != null & this.aClass218_5 != null & this.aClass218_3 != null) {
				this.aClass2_Sub1_6 = new Class2_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass2_Sub1_6.method4205(false, false);
				this.aBoolean846 = true;
			} else {
				this.aBoolean846 = false;
			}
		} else {
			this.aBoolean846 = false;
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return this.aBoolean846;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V")
	public void method8767() {
		if (!this.aBoolean849) {
			return;
		}
		@Pc(11) int local11 = super.aClass5_Sub1_42.XA();
		@Pc(15) int local15 = super.aClass5_Sub1_42.i();
		@Pc(26) float local26 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(38) float local38 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local38, local26, 1.0F / (float) super.aClass5_Sub1_42.anInt403, (float) super.aClass5_Sub1_42.anInt402 / 255.0F);
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method371(super.aClass5_Sub1_42.anInt395);
		super.aClass5_Sub1_42.method334(0);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	public void method8768() {
		@Pc(7) Class115_Sub1 local7 = super.aClass5_Sub1_42.aClass115_Sub1_4;
		if (this.aBoolean847) {
			OpenGL.glBindProgramARB(34336, super.aClass5_Sub1_42.anInt372 == Integer.MAX_VALUE ? this.aClass218_5.anInt7061 : this.aClass218_2.anInt7061);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass5_Sub1_42.anInt372 == Integer.MAX_VALUE ? this.aClass218_3.anInt7061 : this.aClass218_4.anInt7061);
		}
		local7.method3373(0.0F, (float) super.aClass5_Sub1_42.anInt372, 0.0F, -1.0F, Static397.aFloatArray65);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static397.aFloatArray65[0], Static397.aFloatArray65[1], Static397.aFloatArray65[2], Static397.aFloatArray65[3]);
		OpenGL.glEnable(34336);
		this.aBoolean849 = true;
		this.method8767();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		this.aBoolean847 = arg0;
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352(this.aClass2_Sub1_6);
		super.aClass5_Sub1_42.method388(7681, 34165);
		super.aClass5_Sub1_42.method329(0, 768, 34166);
		super.aClass5_Sub1_42.method329(2, 770, 5890);
		super.aClass5_Sub1_42.method375(0, 34168);
		super.aClass5_Sub1_42.method334(0);
		this.method8768();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		if (this.aBoolean849) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean849 = false;
		}
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352((Class2) null);
		super.aClass5_Sub1_42.method388(8448, 8448);
		super.aClass5_Sub1_42.method329(0, 768, 5890);
		super.aClass5_Sub1_42.method329(2, 770, 34166);
		super.aClass5_Sub1_42.method375(0, 5890);
		super.aClass5_Sub1_42.method334(0);
		if (this.aBoolean848) {
			super.aClass5_Sub1_42.method329(0, 768, 5890);
			super.aClass5_Sub1_42.method375(0, 5890);
			this.aBoolean848 = false;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean848) {
				super.aClass5_Sub1_42.method329(0, 768, 5890);
				super.aClass5_Sub1_42.method375(0, 5890);
				this.aBoolean848 = false;
			}
			super.aClass5_Sub1_42.method352(arg0);
			super.aClass5_Sub1_42.method385(arg1);
		} else if (!this.aBoolean848) {
			super.aClass5_Sub1_42.method352(super.aClass5_Sub1_42.aClass2_Sub1_1);
			super.aClass5_Sub1_42.method385(1);
			super.aClass5_Sub1_42.method329(0, 768, 34168);
			super.aClass5_Sub1_42.method375(0, 34168);
			this.aBoolean848 = true;
		}
	}
}
