import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class19_Sub6 extends Class19 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
	private final boolean aBoolean388;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!iu;")
	private Class173 aClass173_2;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Lclient!iu;")
	private Class173 aClass173_3;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Lclient!iu;")
	private Class173 aClass173_1;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "Lclient!iu;")
	private Class173 aClass173_4;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Lclient!ho;")
	private Class44_Sub1 aClass44_Sub1_5;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class19_Sub6(@OriginalArg(0) Class143_Sub2 arg0) {
		super(arg0);
		if (super.aClass143_Sub2_39.aBoolean425) {
			this.aClass173_2 = Static128.method1999("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass143_Sub2_39);
			this.aClass173_3 = Static128.method1999("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass143_Sub2_39);
			this.aClass173_1 = Static128.method1999("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass143_Sub2_39);
			this.aClass173_4 = Static128.method1999("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass143_Sub2_39);
			if (this.aClass173_4 != null & this.aClass173_1 != null & this.aClass173_2 != null & this.aClass173_3 != null) {
				this.aClass44_Sub1_5 = new Class44_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass44_Sub1_5.method794(false, false);
				this.aBoolean388 = true;
			} else {
				this.aBoolean388 = false;
			}
		} else {
			this.aBoolean388 = false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		if (this.aBoolean390) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean390 = false;
		}
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945((Class44) null);
		super.aClass143_Sub2_39.method4940(8448, 8448);
		super.aClass143_Sub2_39.method4947(768, 0, 5890);
		super.aClass143_Sub2_39.method4947(770, 2, 34166);
		super.aClass143_Sub2_39.method4933(5890, 0);
		super.aClass143_Sub2_39.method4930(0);
		if (this.aBoolean389) {
			super.aClass143_Sub2_39.method4947(768, 0, 5890);
			super.aClass143_Sub2_39.method4933(5890, 0);
			this.aBoolean389 = false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	public void method4770() {
		@Pc(7) Class56_Sub3 local7 = super.aClass143_Sub2_39.aClass56_Sub3_4;
		if (this.aBoolean391) {
			OpenGL.glBindProgramARB(34336, super.aClass143_Sub2_39.anInt5854 == Integer.MAX_VALUE ? this.aClass173_3.anInt4121 : this.aClass173_4.anInt4121);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass143_Sub2_39.anInt5854 == Integer.MAX_VALUE ? this.aClass173_2.anInt4121 : this.aClass173_1.anInt4121);
		}
		local7.method8407(-1.0F, 0.0F, 0.0F, Static260.aFloatArray16, (float) super.aClass143_Sub2_39.anInt5854);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static260.aFloatArray16[0], Static260.aFloatArray16[1], Static260.aFloatArray16[2], Static260.aFloatArray16[3]);
		OpenGL.glEnable(34336);
		this.aBoolean390 = true;
		this.method4772();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		this.aBoolean391 = arg0;
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945(this.aClass44_Sub1_5);
		super.aClass143_Sub2_39.method4940(34165, 7681);
		super.aClass143_Sub2_39.method4947(768, 0, 34166);
		super.aClass143_Sub2_39.method4947(770, 2, 5890);
		super.aClass143_Sub2_39.method4933(34168, 0);
		super.aClass143_Sub2_39.method4930(0);
		this.method4770();
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public void method4772() {
		if (!this.aBoolean390) {
			return;
		}
		@Pc(6) int local6 = super.aClass143_Sub2_39.XA();
		@Pc(10) int local10 = super.aClass143_Sub2_39.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass143_Sub2_39.anInt5856, (float) super.aClass143_Sub2_39.anInt5844 / 255.0F);
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4982(super.aClass143_Sub2_39.anInt5859);
		super.aClass143_Sub2_39.method4930(0);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return this.aBoolean388;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean389) {
				super.aClass143_Sub2_39.method4947(768, 0, 5890);
				super.aClass143_Sub2_39.method4933(5890, 0);
				this.aBoolean389 = false;
			}
			super.aClass143_Sub2_39.method4945(arg0);
			super.aClass143_Sub2_39.method4994(arg1);
		} else if (!this.aBoolean389) {
			super.aClass143_Sub2_39.method4945(super.aClass143_Sub2_39.aClass44_Sub1_6);
			super.aClass143_Sub2_39.method4994(1);
			super.aClass143_Sub2_39.method4947(768, 0, 34168);
			super.aClass143_Sub2_39.method4933(34168, 0);
			this.aBoolean389 = true;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
	}
}
