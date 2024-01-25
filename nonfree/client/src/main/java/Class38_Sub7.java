import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class38_Sub7 extends Class38 {

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
	private boolean aBoolean639;

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "Z")
	private boolean aBoolean641;

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "Z")
	private boolean aBoolean640 = false;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "Z")
	private final boolean aBoolean638;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lclient!td;")
	private Class331 aClass331_2;

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "Lclient!td;")
	private Class331 aClass331_5;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "Lclient!td;")
	private Class331 aClass331_3;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "Lclient!td;")
	private Class331 aClass331_4;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "Lclient!tca;")
	private Class85_Sub3 aClass85_Sub3_6;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class38_Sub7(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
		if (super.aClass13_Sub2_39.aBoolean181) {
			this.aClass331_2 = Static146.method2735("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass13_Sub2_39);
			this.aClass331_5 = Static146.method2735("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass13_Sub2_39);
			this.aClass331_3 = Static146.method2735("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass13_Sub2_39);
			this.aClass331_4 = Static146.method2735("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass13_Sub2_39);
			if (this.aClass331_5 != null & this.aClass331_2 != null & this.aClass331_3 != null & this.aClass331_4 != null) {
				this.aClass85_Sub3_6 = new Class85_Sub3(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass85_Sub3_6.method5365(false, false);
				this.aBoolean638 = true;
			} else {
				this.aBoolean638 = false;
			}
		} else {
			this.aBoolean638 = false;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean640) {
				super.aClass13_Sub2_39.method2012(5890, 768, 0);
				super.aClass13_Sub2_39.method2028(0, 5890);
				this.aBoolean640 = false;
			}
			super.aClass13_Sub2_39.method2024(arg0);
			super.aClass13_Sub2_39.method1960(arg1);
		} else if (!this.aBoolean640) {
			super.aClass13_Sub2_39.method2024(super.aClass13_Sub2_39.aClass85_Sub3_3);
			super.aClass13_Sub2_39.method1960(1);
			super.aClass13_Sub2_39.method2012(34168, 768, 0);
			super.aClass13_Sub2_39.method2028(0, 34168);
			this.aBoolean640 = true;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return this.aBoolean638;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
	public void method7284() {
		if (!this.aBoolean641) {
			return;
		}
		@Pc(14) int local14 = super.aClass13_Sub2_39.XA();
		@Pc(18) int local18 = super.aClass13_Sub2_39.i();
		@Pc(29) float local29 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(40) float local40 = (float) local14 - (float) (local14 - local18) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, local29, 1.0F / (float) super.aClass13_Sub2_39.anInt2197, (float) super.aClass13_Sub2_39.anInt2193 / 255.0F);
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method1962(super.aClass13_Sub2_39.anInt2195);
		super.aClass13_Sub2_39.method2008(0);
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
	public void method7285() {
		@Pc(7) Class239_Sub2 local7 = super.aClass13_Sub2_39.aClass239_Sub2_4;
		if (this.aBoolean639) {
			OpenGL.glBindProgramARB(34336, super.aClass13_Sub2_39.anInt2186 == Integer.MAX_VALUE ? this.aClass331_5.anInt9187 : this.aClass331_4.anInt9187);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass13_Sub2_39.anInt2186 == Integer.MIN_VALUE ? this.aClass331_2.anInt9187 : this.aClass331_3.anInt9187);
		}
		local7.method7195(Static311.aFloatArray27, -1.0F, 0.0F, 0.0F, (float) super.aClass13_Sub2_39.anInt2186);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static311.aFloatArray27[0], Static311.aFloatArray27[1], Static311.aFloatArray27[2], Static311.aFloatArray27[3]);
		OpenGL.glEnable(34336);
		this.aBoolean641 = true;
		this.method7284();
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		if (this.aBoolean641) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean641 = false;
		}
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024((Class85) null);
		super.aClass13_Sub2_39.method1993(8448, 8448);
		super.aClass13_Sub2_39.method2012(5890, 768, 0);
		super.aClass13_Sub2_39.method2012(34166, 770, 2);
		super.aClass13_Sub2_39.method2028(0, 5890);
		super.aClass13_Sub2_39.method2008(0);
		if (this.aBoolean640) {
			super.aClass13_Sub2_39.method2012(5890, 768, 0);
			super.aClass13_Sub2_39.method2028(0, 5890);
			this.aBoolean640 = false;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		this.aBoolean639 = arg0;
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024(this.aClass85_Sub3_6);
		super.aClass13_Sub2_39.method1993(7681, 34165);
		super.aClass13_Sub2_39.method2012(34166, 768, 0);
		super.aClass13_Sub2_39.method2012(5890, 770, 2);
		super.aClass13_Sub2_39.method2028(0, 34168);
		super.aClass13_Sub2_39.method2008(0);
		this.method7285();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
	}
}
