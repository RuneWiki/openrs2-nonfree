import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class59_Sub8 extends Class59 {

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Z")
	private boolean aBoolean674;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "Z")
	private boolean aBoolean675;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Z")
	private boolean aBoolean677 = false;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Z")
	private final boolean aBoolean676;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!jq;")
	private Class187 aClass187_2;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!jq;")
	private Class187 aClass187_5;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!jq;")
	private Class187 aClass187_4;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Lclient!jq;")
	private Class187 aClass187_3;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!bq;")
	private Class10_Sub2 aClass10_Sub2_6;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class59_Sub8(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
		if (super.aClass13_Sub2_43.aBoolean85) {
			this.aClass187_2 = Static476.method6758("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass13_Sub2_43);
			this.aClass187_5 = Static476.method6758("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass13_Sub2_43);
			this.aClass187_4 = Static476.method6758("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass13_Sub2_43);
			this.aClass187_3 = Static476.method6758("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass13_Sub2_43);
			if (this.aClass187_3 != null & this.aClass187_4 != null & this.aClass187_2 != null & this.aClass187_5 != null) {
				this.aClass10_Sub2_6 = new Class10_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass10_Sub2_6.method720(false, false);
				this.aBoolean676 = true;
			} else {
				this.aBoolean676 = false;
			}
		} else {
			this.aBoolean676 = false;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
	public void method8044() {
		@Pc(7) Class51_Sub3 local7 = super.aClass13_Sub2_43.aClass51_Sub3_4;
		if (this.aBoolean674) {
			OpenGL.glBindProgramARB(34336, ~super.aClass13_Sub2_43.anInt1117 == Integer.MIN_VALUE ? this.aClass187_5.anInt5092 : this.aClass187_3.anInt5092);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass13_Sub2_43.anInt1117 == Integer.MAX_VALUE ? this.aClass187_2.anInt5092 : this.aClass187_4.anInt5092);
		}
		local7.method6726(-1.0F, (float) super.aClass13_Sub2_43.anInt1117, Static451.aFloatArray65, 0.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static451.aFloatArray65[0], Static451.aFloatArray65[1], Static451.aFloatArray65[2], Static451.aFloatArray65[3]);
		OpenGL.glEnable(34336);
		this.aBoolean675 = true;
		this.method8046();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	public void method8046() {
		if (!this.aBoolean675) {
			return;
		}
		@Pc(6) int local6 = super.aClass13_Sub2_43.XA();
		@Pc(10) int local10 = super.aClass13_Sub2_43.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass13_Sub2_43.anInt1096, (float) super.aClass13_Sub2_43.anInt1086 / 255.0F);
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1068(super.aClass13_Sub2_43.anInt1118);
		super.aClass13_Sub2_43.method1093(0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		if (arg1 != null) {
			if (this.aBoolean677) {
				super.aClass13_Sub2_43.method1021(5890, 768, 0);
				super.aClass13_Sub2_43.method1034(5890, 0);
				this.aBoolean677 = false;
			}
			super.aClass13_Sub2_43.method1096(arg1);
			super.aClass13_Sub2_43.method1046(arg0);
		} else if (!this.aBoolean677) {
			super.aClass13_Sub2_43.method1096(super.aClass13_Sub2_43.aClass10_Sub2_1);
			super.aClass13_Sub2_43.method1046(1);
			super.aClass13_Sub2_43.method1021(34168, 768, 0);
			super.aClass13_Sub2_43.method1034(34168, 0);
			this.aBoolean677 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		if (this.aBoolean675) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean675 = false;
		}
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096((Class10) null);
		super.aClass13_Sub2_43.method1045(8448, 8448);
		super.aClass13_Sub2_43.method1021(5890, 768, 0);
		super.aClass13_Sub2_43.method1021(34166, 770, 2);
		super.aClass13_Sub2_43.method1034(5890, 0);
		super.aClass13_Sub2_43.method1093(0);
		if (this.aBoolean677) {
			super.aClass13_Sub2_43.method1021(5890, 768, 0);
			super.aClass13_Sub2_43.method1034(5890, 0);
			this.aBoolean677 = false;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		this.aBoolean674 = arg0;
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096(this.aClass10_Sub2_6);
		super.aClass13_Sub2_43.method1045(34165, 7681);
		super.aClass13_Sub2_43.method1021(34166, 768, 0);
		super.aClass13_Sub2_43.method1021(5890, 770, 2);
		super.aClass13_Sub2_43.method1034(34168, 0);
		super.aClass13_Sub2_43.method1093(0);
		this.method8044();
	}
}
