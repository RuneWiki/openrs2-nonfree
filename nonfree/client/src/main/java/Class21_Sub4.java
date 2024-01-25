import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class21_Sub4 extends Class21 {

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Z")
	private boolean aBoolean377 = false;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Lclient!wea;")
	private Class386 aClass386_1;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Lclient!wea;")
	private Class386 aClass386_4;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "Lclient!wea;")
	private Class386 aClass386_3;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "Lclient!wea;")
	private Class386 aClass386_2;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "Z")
	private final boolean aBoolean376;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "Lclient!kf;")
	private Class39_Sub4 aClass39_Sub4_2;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class21_Sub4(@OriginalArg(0) Class16_Sub2 arg0) {
		super(arg0);
		if (super.aClass16_Sub2_43.aBoolean336) {
			this.aClass386_1 = Static478.method6830("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass16_Sub2_43);
			this.aClass386_4 = Static478.method6830("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass16_Sub2_43);
			this.aClass386_3 = Static478.method6830("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass16_Sub2_43);
			this.aClass386_2 = Static478.method6830("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass16_Sub2_43);
			if (this.aClass386_1 != null & this.aClass386_4 != null & this.aClass386_3 != null & this.aClass386_2 != null) {
				this.aClass39_Sub4_2 = new Class39_Sub4(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass39_Sub4_2.method8469(false, false);
				this.aBoolean376 = true;
			} else {
				this.aBoolean376 = false;
			}
		} else {
			this.aBoolean376 = false;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		this.aBoolean375 = arg0;
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3620(this.aClass39_Sub4_2);
		super.aClass16_Sub2_43.method3671(34165, 7681);
		super.aClass16_Sub2_43.method3669(34166, 0, 768);
		super.aClass16_Sub2_43.method3669(5890, 2, 770);
		super.aClass16_Sub2_43.method3661(0, 34168);
		super.aClass16_Sub2_43.method3683(0);
		this.method4006();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		if (arg1 != null) {
			if (this.aBoolean377) {
				super.aClass16_Sub2_43.method3669(5890, 0, 768);
				super.aClass16_Sub2_43.method3661(0, 5890);
				this.aBoolean377 = false;
			}
			super.aClass16_Sub2_43.method3620(arg1);
			super.aClass16_Sub2_43.method3680(arg0);
		} else if (!this.aBoolean377) {
			super.aClass16_Sub2_43.method3620(super.aClass16_Sub2_43.aClass39_Sub4_1);
			super.aClass16_Sub2_43.method3680(1);
			super.aClass16_Sub2_43.method3669(34168, 0, 768);
			super.aClass16_Sub2_43.method3661(0, 34168);
			this.aBoolean377 = true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		if (this.aBoolean374) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean374 = false;
		}
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3620((Class39) null);
		super.aClass16_Sub2_43.method3671(8448, 8448);
		super.aClass16_Sub2_43.method3669(5890, 0, 768);
		super.aClass16_Sub2_43.method3669(34166, 2, 770);
		super.aClass16_Sub2_43.method3661(0, 5890);
		super.aClass16_Sub2_43.method3683(0);
		if (this.aBoolean377) {
			super.aClass16_Sub2_43.method3669(5890, 0, 768);
			super.aClass16_Sub2_43.method3661(0, 5890);
			this.aBoolean377 = false;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return this.aBoolean376;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	public void method4006() {
		@Pc(7) Class25_Sub1 local7 = super.aClass16_Sub2_43.aClass25_Sub1_4;
		if (this.aBoolean375) {
			OpenGL.glBindProgramARB(34336, ~super.aClass16_Sub2_43.anInt4408 == Integer.MIN_VALUE ? this.aClass386_4.anInt10225 : this.aClass386_2.anInt10225);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass16_Sub2_43.anInt4408 == Integer.MAX_VALUE ? this.aClass386_1.anInt10225 : this.aClass386_3.anInt10225);
		}
		local7.method846(Static516.aFloatArray63, 0.0F, -1.0F, 0.0F, (float) super.aClass16_Sub2_43.anInt4408);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static516.aFloatArray63[0], Static516.aFloatArray63[1], Static516.aFloatArray63[2], Static516.aFloatArray63[3]);
		OpenGL.glEnable(34336);
		this.aBoolean374 = true;
		this.method4007();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V")
	public void method4007() {
		if (!this.aBoolean374) {
			return;
		}
		@Pc(10) int local10 = super.aClass16_Sub2_43.XA();
		@Pc(14) int local14 = super.aClass16_Sub2_43.i();
		@Pc(24) float local24 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(35) float local35 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local35, local24, 1.0F / (float) super.aClass16_Sub2_43.anInt4387, (float) super.aClass16_Sub2_43.anInt4407 / 255.0F);
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3644(super.aClass16_Sub2_43.anInt4401);
		super.aClass16_Sub2_43.method3683(0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
