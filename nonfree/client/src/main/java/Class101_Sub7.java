import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class101_Sub7 extends Class101 {

	@OriginalMember(owner = "client!un", name = "m", descriptor = "Z")
	private boolean aBoolean681;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "Z")
	private boolean aBoolean683;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Z")
	private final boolean aBoolean682;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "Lclient!bj;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Lclient!bj;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "Lclient!bj;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "Lclient!bj;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "Lclient!pm;")
	private Class23_Sub1 aClass23_Sub1_6;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class101_Sub7(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (super.aClass100_Sub3_43.aBoolean583) {
			this.aClass35_3 = Static547.method5856("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass100_Sub3_43);
			this.aClass35_2 = Static547.method5856("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass100_Sub3_43);
			this.aClass35_4 = Static547.method5856("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass100_Sub3_43);
			this.aClass35_5 = Static547.method5856("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass100_Sub3_43);
			if (this.aClass35_5 != null & this.aClass35_3 != null & this.aClass35_2 != null & this.aClass35_4 != null) {
				this.aClass23_Sub1_6 = new Class23_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass23_Sub1_6.method377(false, false);
				this.aBoolean682 = true;
			} else {
				this.aBoolean682 = false;
			}
		} else {
			this.aBoolean682 = false;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
	public void method7394() {
		@Pc(7) Class68_Sub1 local7 = super.aClass100_Sub3_43.aClass68_Sub1_4;
		if (this.aBoolean683) {
			OpenGL.glBindProgramARB(34336, ~super.aClass100_Sub3_43.anInt7689 == Integer.MIN_VALUE ? this.aClass35_2.anInt1013 : this.aClass35_5.anInt1013);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass100_Sub3_43.anInt7689 == Integer.MIN_VALUE ? this.aClass35_3.anInt1013 : this.aClass35_4.anInt1013);
		}
		local7.method1264(-1.0F, 0.0F, 0.0F, Static232.aFloatArray37, (float) super.aClass100_Sub3_43.anInt7689);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static232.aFloatArray37[0], Static232.aFloatArray37[1], Static232.aFloatArray37[2], Static232.aFloatArray37[3]);
		OpenGL.glEnable(34336);
		this.aBoolean681 = true;
		this.method7397();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		if (this.aBoolean681) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean681 = false;
		}
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6277(null);
		super.aClass100_Sub3_43.method6300(8448, 8448);
		super.aClass100_Sub3_43.method6283(0, 768, 5890);
		super.aClass100_Sub3_43.method6283(2, 770, 34166);
		super.aClass100_Sub3_43.method6332(5890, 0);
		super.aClass100_Sub3_43.method6344(0);
		super.aClass100_Sub3_43.method6283(0, 768, 5890);
		super.aClass100_Sub3_43.method6332(5890, 0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		this.aBoolean683 = arg0;
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6277(this.aClass23_Sub1_6);
		super.aClass100_Sub3_43.method6300(34165, 7681);
		super.aClass100_Sub3_43.method6283(0, 768, 34166);
		super.aClass100_Sub3_43.method6283(2, 770, 5890);
		super.aClass100_Sub3_43.method6332(34168, 0);
		super.aClass100_Sub3_43.method6344(0);
		this.method7394();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return this.aBoolean682;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public void method7397() {
		if (!this.aBoolean681) {
			return;
		}
		@Pc(18) int local18 = super.aClass100_Sub3_43.U();
		@Pc(22) int local22 = super.aClass100_Sub3_43.BA();
		@Pc(33) float local33 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(45) float local45 = -((float) (local18 - local22) * 0.25F) + (float) local18;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local45, local33, 1.0F / (float) super.aClass100_Sub3_43.anInt7699, (float) super.aClass100_Sub3_43.anInt7685 / 255.0F);
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6289(super.aClass100_Sub3_43.anInt7707);
		super.aClass100_Sub3_43.method6344(0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		if (arg1 == null) {
			super.aClass100_Sub3_43.method6277(super.aClass100_Sub3_43.aClass23_Sub1_5);
			super.aClass100_Sub3_43.method6322(1);
			super.aClass100_Sub3_43.method6283(0, 768, 34168);
			super.aClass100_Sub3_43.method6332(34168, 0);
		} else {
			super.aClass100_Sub3_43.method6277(arg1);
			super.aClass100_Sub3_43.method6322(arg0);
		}
	}
}
