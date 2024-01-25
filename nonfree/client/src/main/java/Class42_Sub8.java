import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class42_Sub8 extends Class42 {

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "Z")
	private boolean aBoolean778;

	@OriginalMember(owner = "client!waa", name = "t", descriptor = "Z")
	private boolean aBoolean780;

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "Z")
	private final boolean aBoolean779;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "Lclient!lk;")
	private Class210 aClass210_3;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Lclient!lk;")
	private Class210 aClass210_2;

	@OriginalMember(owner = "client!waa", name = "x", descriptor = "Lclient!lk;")
	private Class210 aClass210_5;

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "Lclient!lk;")
	private Class210 aClass210_4;

	@OriginalMember(owner = "client!waa", name = "q", descriptor = "Lclient!aaa;")
	private Class3_Sub1 aClass3_Sub1_6;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class42_Sub8(@OriginalArg(0) Class162_Sub3 arg0) {
		super(arg0);
		if (super.aClass162_Sub3_44.aBoolean738) {
			this.aClass210_3 = Static89.method1337(super.aClass162_Sub3_44, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass210_2 = Static89.method1337(super.aClass162_Sub3_44, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass210_5 = Static89.method1337(super.aClass162_Sub3_44, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass210_4 = Static89.method1337(super.aClass162_Sub3_44, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass210_4 != null & this.aClass210_5 != null & this.aClass210_2 != null & this.aClass210_3 != null) {
				this.aClass3_Sub1_6 = new Class3_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass3_Sub1_6.method1720(false, false);
				this.aBoolean779 = true;
			} else {
				this.aBoolean779 = false;
			}
		} else {
			this.aBoolean779 = false;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		this.aBoolean778 = arg0;
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(this.aClass3_Sub1_6);
		super.aClass162_Sub3_44.method6903(34165, 7681);
		super.aClass162_Sub3_44.method6957(34166, 768, 0);
		super.aClass162_Sub3_44.method6957(5890, 770, 2);
		super.aClass162_Sub3_44.method6926(34168, 0);
		super.aClass162_Sub3_44.method6947(0);
		this.method7487();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return this.aBoolean779;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1 == null) {
			super.aClass162_Sub3_44.method6911(super.aClass162_Sub3_44.aClass3_Sub1_5);
			super.aClass162_Sub3_44.method6953(1);
			super.aClass162_Sub3_44.method6957(34168, 768, 0);
			super.aClass162_Sub3_44.method6926(34168, 0);
		} else {
			super.aClass162_Sub3_44.method6911(arg1);
			super.aClass162_Sub3_44.method6953(arg0);
		}
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)V")
	public void method7487() {
		@Pc(7) Class25_Sub1 local7 = super.aClass162_Sub3_44.aClass25_Sub1_4;
		if (this.aBoolean778) {
			OpenGL.glBindProgramARB(34336, super.aClass162_Sub3_44.anInt8710 == Integer.MAX_VALUE ? this.aClass210_2.anInt5074 : this.aClass210_4.anInt5074);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass162_Sub3_44.anInt8710 == Integer.MIN_VALUE ? this.aClass210_3.anInt5074 : this.aClass210_5.anInt5074);
		}
		local7.method384((float) super.aClass162_Sub3_44.anInt8710, 0.0F, -1.0F, Static235.aFloatArray33, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static235.aFloatArray33[0], Static235.aFloatArray33[1], Static235.aFloatArray33[2], Static235.aFloatArray33[3]);
		OpenGL.glEnable(34336);
		this.aBoolean780 = true;
		this.method7488();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		if (this.aBoolean780) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean780 = false;
		}
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(null);
		super.aClass162_Sub3_44.method6903(8448, 8448);
		super.aClass162_Sub3_44.method6957(5890, 768, 0);
		super.aClass162_Sub3_44.method6957(34166, 770, 2);
		super.aClass162_Sub3_44.method6926(5890, 0);
		super.aClass162_Sub3_44.method6947(0);
		super.aClass162_Sub3_44.method6957(5890, 768, 0);
		super.aClass162_Sub3_44.method6926(5890, 0);
	}

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)V")
	public void method7488() {
		if (!this.aBoolean780) {
			return;
		}
		@Pc(15) int local15 = super.aClass162_Sub3_44.U();
		@Pc(19) int local19 = super.aClass162_Sub3_44.BA();
		@Pc(29) float local29 = (float) local15 - (float) (local15 - local19) * 0.125F;
		@Pc(40) float local40 = -((float) (local15 - local19) * 0.25F) + (float) local15;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, local29, 1.0F / (float) super.aClass162_Sub3_44.anInt8704, (float) super.aClass162_Sub3_44.anInt8700 / 255.0F);
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6961(super.aClass162_Sub3_44.anInt8721);
		super.aClass162_Sub3_44.method6947(0);
	}
}
