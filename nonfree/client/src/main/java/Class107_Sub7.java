import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class107_Sub7 extends Class107 {

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
	private boolean aBoolean599;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "Z")
	private boolean aBoolean601;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Z")
	private boolean aBoolean602 = false;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "Lclient!pp;")
	private Class264 aClass264_5;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "Lclient!pp;")
	private Class264 aClass264_3;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!pp;")
	private Class264 aClass264_2;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "Lclient!pp;")
	private Class264 aClass264_4;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Z")
	private final boolean aBoolean600;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Lclient!me;")
	private Class88_Sub2 aClass88_Sub2_3;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class107_Sub7(@OriginalArg(0) Class87_Sub2 arg0) {
		super(arg0);
		if (super.aClass87_Sub2_37.aBoolean555) {
			this.aClass264_5 = Static149.method7703(super.aClass87_Sub2_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass264_3 = Static149.method7703(super.aClass87_Sub2_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass264_2 = Static149.method7703(super.aClass87_Sub2_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass264_4 = Static149.method7703(super.aClass87_Sub2_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass264_5 != null & this.aClass264_3 != null & this.aClass264_2 != null & this.aClass264_4 != null) {
				this.aClass88_Sub2_3 = new Class88_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass88_Sub2_3.method5202(false, false);
				this.aBoolean600 = true;
			} else {
				this.aBoolean600 = false;
			}
		} else {
			this.aBoolean600 = false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return this.aBoolean600;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		this.aBoolean601 = arg0;
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(this.aClass88_Sub2_3);
		super.aClass87_Sub2_37.method6227(34165, 7681);
		super.aClass87_Sub2_37.method6206(0, 768, 34166);
		super.aClass87_Sub2_37.method6206(2, 770, 5890);
		super.aClass87_Sub2_37.method6195(34168, 0);
		super.aClass87_Sub2_37.method6155(0);
		this.method6691();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean602) {
				super.aClass87_Sub2_37.method6206(0, 768, 5890);
				super.aClass87_Sub2_37.method6195(5890, 0);
				this.aBoolean602 = false;
			}
			super.aClass87_Sub2_37.method6167(arg0);
			super.aClass87_Sub2_37.method6159(arg1);
		} else if (!this.aBoolean602) {
			super.aClass87_Sub2_37.method6167(super.aClass87_Sub2_37.aClass88_Sub2_2);
			super.aClass87_Sub2_37.method6159(1);
			super.aClass87_Sub2_37.method6206(0, 768, 34168);
			super.aClass87_Sub2_37.method6195(34168, 0);
			this.aBoolean602 = true;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	public void method6687() {
		if (!this.aBoolean599) {
			return;
		}
		@Pc(15) int local15 = super.aClass87_Sub2_37.XA();
		@Pc(19) int local19 = super.aClass87_Sub2_37.i();
		@Pc(30) float local30 = (float) local15 - (float) (local15 - local19) * 0.125F;
		@Pc(41) float local41 = (float) local15 - (float) (local15 - local19) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local30, 1.0F / (float) super.aClass87_Sub2_37.anInt7402, (float) super.aClass87_Sub2_37.anInt7390 / 255.0F);
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6203(super.aClass87_Sub2_37.anInt7406);
		super.aClass87_Sub2_37.method6155(0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		if (this.aBoolean599) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean599 = false;
		}
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(null);
		super.aClass87_Sub2_37.method6227(8448, 8448);
		super.aClass87_Sub2_37.method6206(0, 768, 5890);
		super.aClass87_Sub2_37.method6206(2, 770, 34166);
		super.aClass87_Sub2_37.method6195(5890, 0);
		super.aClass87_Sub2_37.method6155(0);
		if (this.aBoolean602) {
			super.aClass87_Sub2_37.method6206(0, 768, 5890);
			super.aClass87_Sub2_37.method6195(5890, 0);
			this.aBoolean602 = false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
	public void method6691() {
		@Pc(7) Class6_Sub1 local7 = super.aClass87_Sub2_37.aClass6_Sub1_4;
		if (this.aBoolean601) {
			OpenGL.glBindProgramARB(34336, super.aClass87_Sub2_37.anInt7380 == Integer.MAX_VALUE ? this.aClass264_3.anInt7803 : this.aClass264_4.anInt7803);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass87_Sub2_37.anInt7380 == Integer.MAX_VALUE ? this.aClass264_5.anInt7803 : this.aClass264_2.anInt7803);
		}
		local7.method112((float) super.aClass87_Sub2_37.anInt7380, Static381.aFloatArray55, 0.0F, -1.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static381.aFloatArray55[0], Static381.aFloatArray55[1], Static381.aFloatArray55[2], Static381.aFloatArray55[3]);
		OpenGL.glEnable(34336);
		this.aBoolean599 = true;
		this.method6687();
	}
}
