import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class231_Sub4 extends Class231 {

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "Z")
	private boolean aBoolean658;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "Z")
	private boolean aBoolean659;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Z")
	private boolean aBoolean660 = false;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "Lclient!oca;")
	private Class261 aClass261_4;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Lclient!oca;")
	private Class261 aClass261_2;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "Lclient!oca;")
	private Class261 aClass261_5;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!oca;")
	private Class261 aClass261_3;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "Lclient!gha;")
	private Class80_Sub2 aClass80_Sub2_6;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Z")
	private final boolean aBoolean661;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class231_Sub4(@OriginalArg(0) Class65_Sub1 arg0) {
		super(arg0);
		if (super.aClass65_Sub1_41.aBoolean93) {
			this.aClass261_4 = Static234.method3621("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass65_Sub1_41);
			this.aClass261_2 = Static234.method3621("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass65_Sub1_41);
			this.aClass261_5 = Static234.method3621("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass65_Sub1_41);
			this.aClass261_3 = Static234.method3621("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass65_Sub1_41);
			if (this.aClass261_4 != null & this.aClass261_2 != null & this.aClass261_5 != null & this.aClass261_3 != null) {
				this.aClass80_Sub2_6 = new Class80_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass80_Sub2_6.method7150(false, false);
				this.aBoolean661 = true;
			} else {
				this.aBoolean661 = false;
			}
		} else {
			this.aBoolean661 = false;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		if (this.aBoolean659) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean659 = false;
		}
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286((Class80) null);
		super.aClass65_Sub1_41.method1228(8448, 8448);
		super.aClass65_Sub1_41.method1265(0, 768, 5890);
		super.aClass65_Sub1_41.method1265(2, 770, 34166);
		super.aClass65_Sub1_41.method1233(0, 5890);
		super.aClass65_Sub1_41.method1256(0);
		if (this.aBoolean660) {
			super.aClass65_Sub1_41.method1265(0, 768, 5890);
			super.aClass65_Sub1_41.method1233(0, 5890);
			this.aBoolean660 = false;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	public void method6551() {
		@Pc(7) Class254_Sub1 local7 = super.aClass65_Sub1_41.aClass254_Sub1_3;
		if (this.aBoolean658) {
			OpenGL.glBindProgramARB(34336, ~super.aClass65_Sub1_41.anInt1420 == Integer.MIN_VALUE ? this.aClass261_2.anInt7333 : this.aClass261_3.anInt7333);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass65_Sub1_41.anInt1420 == Integer.MAX_VALUE ? this.aClass261_4.anInt7333 : this.aClass261_5.anInt7333);
		}
		local7.method5934(-1.0F, 0.0F, Static452.aFloatArray76, (float) super.aClass65_Sub1_41.anInt1420, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static452.aFloatArray76[0], Static452.aFloatArray76[1], Static452.aFloatArray76[2], Static452.aFloatArray76[3]);
		OpenGL.glEnable(34336);
		this.aBoolean659 = true;
		this.method6553();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean660) {
				super.aClass65_Sub1_41.method1265(0, 768, 5890);
				super.aClass65_Sub1_41.method1233(0, 5890);
				this.aBoolean660 = false;
			}
			super.aClass65_Sub1_41.method1286(arg0);
			super.aClass65_Sub1_41.method1290(arg1);
		} else if (!this.aBoolean660) {
			super.aClass65_Sub1_41.method1286(super.aClass65_Sub1_41.aClass80_Sub2_1);
			super.aClass65_Sub1_41.method1290(1);
			super.aClass65_Sub1_41.method1265(0, 768, 34168);
			super.aClass65_Sub1_41.method1233(0, 34168);
			this.aBoolean660 = true;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return this.aBoolean661;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		this.aBoolean658 = arg0;
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286(this.aClass80_Sub2_6);
		super.aClass65_Sub1_41.method1228(34165, 7681);
		super.aClass65_Sub1_41.method1265(0, 768, 34166);
		super.aClass65_Sub1_41.method1265(2, 770, 5890);
		super.aClass65_Sub1_41.method1233(0, 34168);
		super.aClass65_Sub1_41.method1256(0);
		this.method6551();
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)V")
	public void method6553() {
		if (!this.aBoolean659) {
			return;
		}
		@Pc(11) int local11 = super.aClass65_Sub1_41.XA();
		@Pc(15) int local15 = super.aClass65_Sub1_41.i();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(38) float local38 = (float) local11 - (float) (local11 - local15) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local38, local27, 1.0F / (float) super.aClass65_Sub1_41.anInt1400, (float) super.aClass65_Sub1_41.anInt1395 / 255.0F);
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1232(super.aClass65_Sub1_41.anInt1401);
		super.aClass65_Sub1_41.method1256(0);
	}
}
