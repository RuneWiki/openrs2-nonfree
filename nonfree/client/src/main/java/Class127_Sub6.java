import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class127_Sub6 extends Class127 {

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "Z")
	private boolean aBoolean487;

	@OriginalMember(owner = "client!mea", name = "t", descriptor = "Z")
	private boolean aBoolean488;

	@OriginalMember(owner = "client!mea", name = "w", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "Z")
	private final boolean aBoolean486;

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "Lclient!ft;")
	private Class117 aClass117_2;

	@OriginalMember(owner = "client!mea", name = "y", descriptor = "Lclient!ft;")
	private Class117 aClass117_3;

	@OriginalMember(owner = "client!mea", name = "B", descriptor = "Lclient!ft;")
	private Class117 aClass117_5;

	@OriginalMember(owner = "client!mea", name = "z", descriptor = "Lclient!ft;")
	private Class117 aClass117_4;

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "Lclient!ol;")
	private Class76_Sub3 aClass76_Sub3_3;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class127_Sub6(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
		if (super.aClass5_Sub2_42.aBoolean375) {
			this.aClass117_2 = Static360.method5895(super.aClass5_Sub2_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass117_3 = Static360.method5895(super.aClass5_Sub2_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass117_5 = Static360.method5895(super.aClass5_Sub2_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass117_4 = Static360.method5895(super.aClass5_Sub2_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass117_4 != null & this.aClass117_3 != null & this.aClass117_2 != null & this.aClass117_5 != null) {
				this.aClass76_Sub3_3 = new Class76_Sub3(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass76_Sub3_3.method6412(false, false);
				this.aBoolean486 = true;
			} else {
				this.aBoolean486 = false;
			}
		} else {
			this.aBoolean486 = false;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	public void method5745() {
		@Pc(7) Class39_Sub2 local7 = super.aClass5_Sub2_42.aClass39_Sub2_4;
		if (this.aBoolean488) {
			OpenGL.glBindProgramARB(34336, ~super.aClass5_Sub2_42.anInt5683 == Integer.MIN_VALUE ? this.aClass117_3.anInt3241 : this.aClass117_4.anInt3241);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass5_Sub2_42.anInt5683 == Integer.MAX_VALUE ? this.aClass117_2.anInt3241 : this.aClass117_5.anInt3241);
		}
		local7.method6548(Static337.aFloatArray45, 0.0F, (float) super.aClass5_Sub2_42.anInt5683, 0.0F, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static337.aFloatArray45[0], Static337.aFloatArray45[1], Static337.aFloatArray45[2], Static337.aFloatArray45[3]);
		OpenGL.glEnable(34336);
		this.aBoolean487 = true;
		this.method5746();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)V")
	public void method5746() {
		if (!this.aBoolean487) {
			return;
		}
		@Pc(15) int local15 = super.aClass5_Sub2_42.XA();
		@Pc(19) int local19 = super.aClass5_Sub2_42.i();
		@Pc(30) float local30 = -((float) (local15 - local19) * 0.125F) + (float) local15;
		@Pc(41) float local41 = (float) local15 - (float) (local15 - local19) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local30, 1.0F / (float) super.aClass5_Sub2_42.anInt5679, (float) super.aClass5_Sub2_42.anInt5678 / 255.0F);
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4956(super.aClass5_Sub2_42.anInt5680);
		super.aClass5_Sub2_42.method5004(0);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return this.aBoolean486;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		if (this.aBoolean487) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean487 = false;
		}
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(null);
		super.aClass5_Sub2_42.method4982(8448, 8448);
		super.aClass5_Sub2_42.method5000(5890, 768, 0);
		super.aClass5_Sub2_42.method5000(34166, 770, 2);
		super.aClass5_Sub2_42.method4969(5890, 0);
		super.aClass5_Sub2_42.method5004(0);
		if (this.aBoolean489) {
			super.aClass5_Sub2_42.method5000(5890, 768, 0);
			super.aClass5_Sub2_42.method4969(5890, 0);
			this.aBoolean489 = false;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean489) {
				super.aClass5_Sub2_42.method5000(5890, 768, 0);
				super.aClass5_Sub2_42.method4969(5890, 0);
				this.aBoolean489 = false;
			}
			super.aClass5_Sub2_42.method4997(arg0);
			super.aClass5_Sub2_42.method4953(arg1);
		} else if (!this.aBoolean489) {
			super.aClass5_Sub2_42.method4997(super.aClass5_Sub2_42.aClass76_Sub3_2);
			super.aClass5_Sub2_42.method4953(1);
			super.aClass5_Sub2_42.method5000(34168, 768, 0);
			super.aClass5_Sub2_42.method4969(34168, 0);
			this.aBoolean489 = true;
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		this.aBoolean488 = arg0;
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(this.aClass76_Sub3_3);
		super.aClass5_Sub2_42.method4982(7681, 34165);
		super.aClass5_Sub2_42.method5000(34166, 768, 0);
		super.aClass5_Sub2_42.method5000(5890, 770, 2);
		super.aClass5_Sub2_42.method4969(34168, 0);
		super.aClass5_Sub2_42.method5004(0);
		this.method5745();
	}
}
