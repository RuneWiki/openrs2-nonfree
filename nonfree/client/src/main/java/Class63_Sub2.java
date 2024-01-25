import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Z")
	private boolean aBoolean184;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
	private final boolean aBoolean183;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!jf;")
	private Class191 aClass191_1;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!jf;")
	private Class191 aClass191_2;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!jf;")
	private Class191 aClass191_4;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!jf;")
	private Class191 aClass191_3;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!fu;")
	private Class125_Sub1 aClass125_Sub1_3;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class63_Sub2(@OriginalArg(0) Class22_Sub1 arg0) {
		super(arg0);
		if (super.aClass22_Sub1_43.aBoolean71) {
			this.aClass191_1 = Static3.method66(super.aClass22_Sub1_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass191_2 = Static3.method66(super.aClass22_Sub1_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass191_4 = Static3.method66(super.aClass22_Sub1_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass191_3 = Static3.method66(super.aClass22_Sub1_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass191_3 != null & this.aClass191_2 != null & this.aClass191_1 != null & this.aClass191_4 != null) {
				this.aClass125_Sub1_3 = new Class125_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass125_Sub1_3.method9224(false, false);
				this.aBoolean183 = true;
			} else {
				this.aBoolean183 = false;
			}
		} else {
			this.aBoolean183 = false;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		this.aBoolean181 = arg0;
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955(this.aClass125_Sub1_3);
		super.aClass22_Sub1_43.method900(7681, 34165);
		super.aClass22_Sub1_43.method935(768, 0, 34166);
		super.aClass22_Sub1_43.method935(770, 2, 5890);
		super.aClass22_Sub1_43.method963(0, 34168);
		super.aClass22_Sub1_43.method931(0);
		this.method2610();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean180) {
				super.aClass22_Sub1_43.method935(768, 0, 5890);
				super.aClass22_Sub1_43.method963(0, 5890);
				this.aBoolean180 = false;
			}
			super.aClass22_Sub1_43.method955(arg0);
			super.aClass22_Sub1_43.method894(arg1);
		} else if (!this.aBoolean180) {
			super.aClass22_Sub1_43.method955(super.aClass22_Sub1_43.aClass125_Sub1_1);
			super.aClass22_Sub1_43.method894(1);
			super.aClass22_Sub1_43.method935(768, 0, 34168);
			super.aClass22_Sub1_43.method963(0, 34168);
			this.aBoolean180 = true;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public void method2610() {
		@Pc(15) Class58_Sub3 local15 = super.aClass22_Sub1_43.aClass58_Sub3_4;
		if (this.aBoolean181) {
			OpenGL.glBindProgramARB(34336, super.aClass22_Sub1_43.anInt1012 == Integer.MAX_VALUE ? this.aClass191_2.anInt4877 : this.aClass191_3.anInt4877);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass22_Sub1_43.anInt1012 == Integer.MIN_VALUE ? this.aClass191_1.anInt4877 : this.aClass191_4.anInt4877);
		}
		local15.method9528((float) super.aClass22_Sub1_43.anInt1012, Static434.aFloatArray79, 0.0F, -1.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static434.aFloatArray79[0], Static434.aFloatArray79[1], Static434.aFloatArray79[2], Static434.aFloatArray79[3]);
		OpenGL.glEnable(34336);
		this.aBoolean184 = true;
		this.method2611();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		if (this.aBoolean184) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean184 = false;
		}
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955((Class125) null);
		super.aClass22_Sub1_43.method900(8448, 8448);
		super.aClass22_Sub1_43.method935(768, 0, 5890);
		super.aClass22_Sub1_43.method935(770, 2, 34166);
		super.aClass22_Sub1_43.method963(0, 5890);
		super.aClass22_Sub1_43.method931(0);
		if (this.aBoolean180) {
			super.aClass22_Sub1_43.method935(768, 0, 5890);
			super.aClass22_Sub1_43.method963(0, 5890);
			this.aBoolean180 = false;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public void method2611() {
		if (!this.aBoolean184) {
			return;
		}
		@Pc(15) int local15 = super.aClass22_Sub1_43.XA();
		@Pc(19) int local19 = super.aClass22_Sub1_43.i();
		@Pc(31) float local31 = -((float) (local15 - local19) * 0.125F) + (float) local15;
		@Pc(42) float local42 = (float) local15 - (float) (local15 - local19) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local42, local31, 1.0F / (float) super.aClass22_Sub1_43.anInt1033, (float) super.aClass22_Sub1_43.anInt1027 / 255.0F);
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method934(super.aClass22_Sub1_43.anInt1018);
		super.aClass22_Sub1_43.method931(0);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return this.aBoolean183;
	}
}
